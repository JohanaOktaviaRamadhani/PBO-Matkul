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
		if (!(jumlahtarik % 20000 == 0 || jumlahtarik % 50000 == 0 || jumlahtarik % 100000 == 0)) {
			throw new IllegalArgumentException("Penarikan hanya boleh kelipatan Rp20.000, Rp50.000, atau Rp100.000.");
		}

		if (jumlahtarik <= saldo) {
			saldo -= jumlahtarik;
		} else {
			double kebutuhan = jumlahtarik - saldo;
			throw new InsufficientFundsException(kebutuhan);
		}
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