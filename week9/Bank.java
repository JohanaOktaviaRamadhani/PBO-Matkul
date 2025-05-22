package week9;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckingAccount ca = new CheckingAccount(101);
        int pilihan;

        do {
            System.out.println("\n MENU BANK");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("Saldo Anda: Rp " + ca.getSaldo());
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah setoran: Rp ");
                double setor = input.nextDouble();
                ca.simpanUang(setor);
                System.out.println("Berhasil menyimpan Rp " + setor);
            } else if (pilihan == 3) {
                System.out.print("Masukkan jumlah penarikan: Rp ");
                double tarik = input.nextDouble();
                try {
                    ca.tarikUang(tarik);
                    System.out.println("Berhasil menarik Rp " + tarik);
                } catch (InsufficientFundsException e) {
                    System.out.println("Gagal menarik. Saldo Anda kurang Rp " + e.getAmount());
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan layanan bank kami.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
