package abstrakbangundatar;

public class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
		this.radius = radius;
	}

    public double getRadius() {
        return radius;
    }


    @Override
    public void draw() {
        System.out.println("Menggambar lingkaran dengan radius " + radius);
    }

    @Override
    public void resize() {
        radius *= 1.5; // contoh resize: perbesar radius 1.5x
        System.out.println("Radius lingkaran resize 1,5x. Sekarang menjadi " + radius);
    }

    
}
