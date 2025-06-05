package abstrakkendaraan;

public class Mobil extends Kendaraan {
	private int kapasitasBagasi;
	
	public int getBagasi() {
		return kapasitasBagasi;
	}
	public void setBagasi(int kapasitasBagasi) {
		this.kapasitasBagasi = kapasitasBagasi;
	}

	@Override
	public void nyalakan() {
		// TODO Auto-generated method stub
		System.out.println("Mobil dinyalakan");
		
	}

}