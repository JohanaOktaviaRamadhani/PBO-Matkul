package abstrakbangundatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran(0); // inisialisasi awal
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== MENU BANGUN DATAR ===");
            System.out.println("1. Lingkaran");
            System.out.println("2. Keluar");
            System.out.print("Pilih opsi (1/2): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan radius lingkaran: ");
                double radius = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Masukkan posisi X: ");
                int x = scanner.nextInt();
                System.out.print("Masukkan posisi Y: ");
                int y = scanner.nextInt();
                scanner.nextLine(); 

                lingkaran.setRadius(radius);
                lingkaran.pindahkan(x, y); 

                System.out.println("\n--- DATA LINGKARAN ---");
                lingkaran.draw();
                lingkaran.resize();
                System.out.println("Dipindahkan ke posisi: (" + x + ", " + y + ")");

            } else if (pilihan == 2) {
                System.out.println("Program selesai. Sampai jumpa..");
                isRunning = false;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
