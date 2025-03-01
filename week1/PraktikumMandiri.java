package week1;

public class PraktikumMandiri {
    public static void main(String[] args) {
            
        // Soal nomor 1 = Menampilkan nama
        String Nama = "Johana Oktavia Ramadhani";
        System.out.println("Halo, nama saya adalah " + Nama);
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro. Saya sedang menulis program Java.");    

        // SOAL KE-2 = Menghitung keliling, luas, volume 
        System.out.println("\n=== KALKULATOR LUAS, KELILING & VOLUME ===");

        // 2a. Keliling lingkaran jika diameter 10
        int diameter = 10;
        float phi = 3.14f;
        float kLingkaran = phi * diameter;
        System.out.println("Jika diameter = " + diameter + " maka keliling lingkarannya adalah = " + kLingkaran);

        // 2b. Luas segitiga siku-siku dengan alas 6 dan tinggi 8
        int alas = 6;
        int tinggi = 8;
        float lSegitiga = 0.5f * alas * tinggi; 
        System.out.println("Jika alas = " + alas + " dan tinggi = " + tinggi + " maka luas segitiga siku-siku adalah = " + lSegitiga);

        // 2c. Volume tabung dengan diameter 5 dan tinggi 10      
        diameter = 5;
        tinggi = 10;
        float r = diameter / 2.0f; 
        float vTabung = (phi * r * r) * tinggi;
        System.out.println("Jika diameter = " + diameter + " dan tinggi = " + tinggi + " maka volume tabung adalah = " + vTabung);
    }
}
