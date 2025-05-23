package week9;
import java.io.*;

public class CheckingAccount {
	private double saldo;
	private int rekening;
	
	public CheckingAccount(int rekening) {
		this.rekening = rekening;
	}
	
	public void simpanUang(double jumlahsetor) {
		saldo += jumlahsetor;
	}
	
	public void tarikUang(double jumlahtarik) throws InsufficientFundsException {
		if (!isValidAmount(jumlahtarik)) {
			throw new IllegalArgumentException("Nominal tidak dapat ditarik. Gunakan kombinasi Rp20.000, Rp50.000, dan Rp100.000.");
		}

		if (jumlahtarik <= saldo) {
			saldo -= jumlahtarik;
		} else {
			double kebutuhan = jumlahtarik - saldo;
			throw new InsufficientFundsException(kebutuhan);
		}
	}

	// ✅ Method validasi kombinasi pecahan
	private boolean isValidAmount(double amount) {
		if (amount < 20000 || amount % 10000 != 0) return false;

		int target = (int) amount;
		int[] pecahan = {50000, 20000};

		for (int i = 0; i <= target / pecahan[0]; i++) {
			for (int j = 0; j <= target / pecahan[1]; j++) {
				for (int k = 0; k <= target / pecahan[2]; k++) {
					int total = (pecahan[0] * i) + (pecahan[1] * j) + (pecahan[2] * k);
					if (total == target) {
						return true;
					}
				}
			}
		}

		return false;
	}


	public double getSaldo()
	{
		return saldo;
	}
	
	public int getAngka()
	{
		return rekening;
	}
}