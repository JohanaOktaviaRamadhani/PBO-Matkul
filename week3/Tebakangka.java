package week3;
import java.util.Scanner;
import java.util.Random;

class Tebakangka {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("=======================");
        System.out.println("       TEBAK ANGKA     ");
        System.out.println("=======================");

        int angka = r.nextInt(100) + 1; // Angka acak antara 1 dan 100
        int tebakan;
        int jumlahTebakan = 0;
        boolean tebakanBenar = false;

        System.out.println("Tebak angka antara 1 dan 100!");

        do {
            System.out.print("\nMasukkan tebakan Anda (1-100): ");
            
            // Validasi input kalau kurang dr 1 & lebih dr 100
            if (s.hasNextInt()) {
                tebakan = s.nextInt();
                jumlahTebakan++; //menghitung jumlah tebakan

                if (tebakan < 1 || tebakan > 100) {
                    System.out.println("Tebakan harus antara 1 dan 100. Coba lagi!");
                    continue;
                }

                if (tebakan != angka) {

                    //petunjuk angka lebih banyak/sedikit
                    if (tebakan > angka) {
                        System.out.println("Tebakan kamu terlalu besar.");
                    } else {
                        System.out.println("Tebakan kamu terlalu kecil.");
                    }

                    // Beri petunjuk genap/ganjil 
                    if (angka % 2 == 0) {
                        System.out.println("Petunjuk: Angka yang dicari adalah bilangan genap.");
                    } else {
                        System.out.println("Petunjuk: Angka yang dicari adalah bilangan ganjil.");
                    }
                    
                } else {
                    tebakanBenar = true;
                    System.out.println("\nSelamat! Tebakan kamu benar!");
                    System.out.println("Kamu menebak dalam " + jumlahTebakan + " percobaan.");
                }
                
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka antara 1 dan 100.");
                s.next(); // Bersihkan input yang tidak valid
            }
        } while (!tebakanBenar); // Loop berlanjut selama tebakan salah
    }
}