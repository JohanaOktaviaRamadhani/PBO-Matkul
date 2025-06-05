package abstrakkendaraan;

public class Truk extends Kendaraan {
	private int kapasitasBak;
	public int getBak() {
		return kapasitasBak;
	}
	public void setBak(int kapasitasBak) {
		this.kapasitasBak = kapasitasBak;
	}


	@Override
	public void nyalakan() {
		System.out.println("Truk dinyalakan.");
	}


}