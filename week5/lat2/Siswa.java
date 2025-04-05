package lat2;
public class Siswa {
    private String nim;
    private String nama;
    private double nilaiTeori;
    private double nilaiPraktek;

    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTeori(double nilaiTeori) {
        this.nilaiTeori = nilaiTeori;
    }

    public void setPraktek(double nilaiPraktek) {
        this.nilaiPraktek = nilaiPraktek;
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getTeori() {
        return nilaiTeori;
    }

    public double getPraktek() {
        return nilaiPraktek;
    }

    public double getRata() {
        return (nilaiTeori + nilaiPraktek) / 2;
    }
}
