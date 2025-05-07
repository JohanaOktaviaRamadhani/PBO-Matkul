package uts;

import week8.character.Hero;
import week8.enemy.MainEnemy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membuat objek hero dari class Hero dan objek enemy dari class MainEnemy
        Hero hero = new Hero("Barbie", 100);
        MainEnemy enemy = new MainEnemy("Ken", 150);

        boolean playing = true; //mendeklarasikan kehidupan game
        System.out.println("=== Selamat Datang di RPG Game Sederhana ===");

        while (playing) {
            System.out.println("\n=== Status ===");
            System.out.println("Hero -> Nama: " + hero.getNama() + " | HP: " + hero.getHp() + " | Ramuan: " + hero.getRamuan());
            System.out.println("Enemy -> Nama: " + enemy.getNama() + " | HP: " + enemy.getHp());
            
            System.out.println("\n=== Menu ===");
            System.out.println("1. Menyerang dengan skill 1");
            System.out.println("2. Menyerang dengan skill 2");
            System.out.println("3. Bertahan");
            System.out.println("4. Minum Ramuan");
            System.out.println("5. Keluar");
            System.out.print("Pilih aksi: ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                hero.attack();
                enemy.defend();
                System.out.println("dari" + enemy.getNama() + " menerima 25 hp!");

            } else if (pilihan == 2) {
                hero.attack(40); //ini kan overloading yang tadi sy buat di hero, pembedanya adalah pendapatan hp menjadi 20, kalau skill 1 mah 10 hp aja
                enemy.defend(40);
                System.out.println("dari" + enemy.getNama() + " menerima 40 hp!");
            }
             else if (pilihan == 3) {
                hero.defend();
                enemy.attack();
                System.out.println("Hp berkurang 10 hp!");

            } else if (pilihan == 4) {
                hero.minumRamuan();
            } else if (pilihan == 5) {
                System.out.println("Keluar dari game. Thanks for playing!");
                playing = false;
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            //kalau hp hero = 0
            if (!hero.isAlive()) {
                System.out.println("\n=== Game Over ===");
                playing = false;
            }

            //kalau hp enemy = 0
            if (enemy.getHp() <= 0) {
                System.out.println("\nSelamat! Musuh telah dikalahkan!");
                playing = false;
            }

            //ini buat ngecek kalau permainan berhenti ditanya nih, mau main lagi ga
            if (playing == false){
                System.out.print("Mau mulai lagi? (y/n): ");
                String restart = input.next();
                if (restart.equalsIgnoreCase("y")) {
                    hero = new Hero("Berbie", 100); //kalau mau main lagi xm aja reset hp di objek lama
                    enemy = new MainEnemy("Ken", 150);
                    playing = true;
                } else {
                    System.out.println("Terima kasih telah bermain!");
                }
            }
        }

        input.close();
    }
}
