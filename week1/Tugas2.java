package week1;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan panjang sisi
        System.out.print("Masukkan panjang sisi : ");
        int panjangSisi = input.nextInt();

        // PERSEGI
        float lPersegi = panjangSisi * panjangSisi;
        float kPersegi = 4 * panjangSisi;

        // SEGITIGA SAMA SISI
        float lSegitiga = 0.5f * panjangSisi * panjangSisi; //saya kasih f diblkg untuk identifikasi bahwa ini float bkn double
        float kSegitiga = 3 * panjangSisi;

        // LINGKARAN
        float phi = 3.14f; //saya kasih f diblkg untuk identifikasi bahwa ini float bkn double
        float lLingkaran = phi * panjangSisi * panjangSisi;
        float kLingkaran = phi * (2 * panjangSisi);

        // KUBUS
        float vKubus = panjangSisi * panjangSisi * panjangSisi;
        float lpKubus = 6 * (panjangSisi * panjangSisi);

        // Menampilkan hasil
        System.out.println("\n=== KALKULATOR LUAS & KELILING ===");
        System.out.println("Luas Persegi = " + lPersegi);
        System.out.println("Keliling Persegi = " + kPersegi);
        System.out.println("Luas Segitiga sama sisi = " + lSegitiga);
        System.out.println("Keliling Segitiga sama sisi = " + kSegitiga);
        System.out.println("Luas Lingkaran = " + lLingkaran);
        System.out.println("Keliling Lingkaran = " + kLingkaran);
        System.out.println("Volume Kubus = " + vKubus);
        System.out.println("Luas Permukaan Kubus = " + lpKubus);

        input.close();
    }
}
