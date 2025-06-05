package abstrakkendaraan;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobil mobilku = new Mobil();
        Truk trukku = new Truk();

        int pilihan = 0;

        while (pilihan != 3) {
            System.out.println("\n=== MENU PILIH KENDARAAN ===");
            System.out.println("1. Mobil");
            System.out.println("2. Truk");
            System.out.println("3. Keluar");
            System.out.print("Pilih jenis kendaraan (1/2/3): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // flush newline

            if (pilihan == 1) {
                System.out.print("Masukkan merk mobil: ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan model mobil: ");
                String model = scanner.nextLine();
                System.out.print("Masukkan kapasitas bagasi: ");
                int kapasitasBagasi = scanner.nextInt();
                scanner.nextLine();

                mobilku.setMerk(merk);
                mobilku.setModel(model);
                mobilku.setJumlahRoda(4);
                mobilku.setBagasi(kapasitasBagasi);

                System.out.println("\n=== Data Mobil ===");
                System.out.println("Merk: " + mobilku.getMerk());
                System.out.println("Model: " + mobilku.getModel());
                System.out.println("Jumlah Roda: " + mobilku.getJumlahRoda());
                System.out.println("Kapasitas bagasi: " + mobilku.getBagasi() + " kg");

            } else if (pilihan == 2) {
                System.out.print("Masukkan merk truk: ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan model truk: ");
                String model = scanner.nextLine();
                System.out.print("Masukkan kapasitas bak: ");
                int kapasitasBak = scanner.nextInt();
                scanner.nextLine();

                trukku.setMerk(merk);
                trukku.setModel(model);
                trukku.setJumlahRoda(6);
                trukku.setBak(kapasitasBak);

                System.out.println("\n=== Data Truk ===");
                System.out.println("Merk: " + trukku.getMerk());
                System.out.println("Model: " + trukku.getModel());
                System.out.println("Jumlah Roda: " + trukku.getJumlahRoda());
                System.out.println("Kapasitas Bak: " + trukku.getBak() + " kg");

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan layanan kami.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }

        scanner.close();
    }
}
