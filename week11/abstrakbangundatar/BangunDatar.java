package abstrakbangundatar;

public abstract class BangunDatar {
	int x,y;
	public void pindahkan(int a, int b)
	{
		x = a;
		y = b;
		System.out.println("Bangun dipindahkan ke koordinat (" + x + "," + y + ")");

	}
	
	public abstract void draw();
	public abstract void resize();

}