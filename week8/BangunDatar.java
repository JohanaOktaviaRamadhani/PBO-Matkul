package week8;

class BangunDatar {
    protected int sisi;
    protected int panjang;
    protected int lebar;
    protected double alas;
    protected double tinggi;
    protected double jarijari;
    public String nama;
    public int luasint;
    public double luasdouble;
    public final double PHI = 3.14;

    // Persegi
    BangunDatar(int sisi) {
        this.sisi = sisi;
        this.nama = "Persegi";
    }

    // Persegi Panjang
    BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.nama = "Persegi Panjang";
    }

    // Segitiga
    BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi ;
        this.nama = "Segitiga";
    }

    // Lingkaran
    BangunDatar(double jarijari) {
        this.jarijari = jarijari;
        this.nama = "Lingkaran";
    }

    public void luas() {
        if (this.sisi != 0) {
            this.luasint = this.sisi * this.sisi;
        } else if (this.panjang != 0 && this.lebar != 0) {
            this.luasint = this.panjang * this.lebar;
        } else if (this.alas != 0.0 && this.tinggi != 0.0) {
            this.luasdouble = (this.alas * this.tinggi) / 2 ;
        } else if (this.jarijari != 0.0) {
            this.luasdouble = this.PHI * this.jarijari * this.jarijari;
        }

        if (this.luasint != 0) {
            System.out.println("Luasnya " + this.nama + " adalah : " + this.luasint);
        } else if (this.luasdouble != 0) {
            System.out.println("Luasnya " + this.nama + " adalah : " + this.luasdouble);
        }
    }
}