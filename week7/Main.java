package week7;
import week2.Character;

public class Main {
    public static void main(String[] args) {
        // Membuat objek hero dan enemy
        Character hero = new Character("Aldebaran", 1, 100, 0);
        Enemy enemy = new Enemy("Goblin", 1, 10, 3);

        System.out.println("Informasi Hero:");
        System.out.println("Nama : "+hero.getNama() + " Level: " + hero.getLevel() + " HP: " + hero.getHp() + " Exp: " + hero.getExp());
        System.out.println("Informasi Enemy:");
        System.out.println("Nama : "+enemy.getNama() + " Level: " + enemy.getLevel() + " HP: " + enemy.getHp() + " Exp: " + enemy.getExp());
        System.out.println();


        // Battle simulation
        hero.attack();
        enemy.attacked();
        System.out.println(enemy.getNama() + " HP setelah diserang: " + enemy.getHp());

        enemy.attack();
        hero.attacked();
        System.out.println(hero.getNama() + " HP setelah diserang: " + hero.getHp());

        // Hero minum ramuan dan level up
        hero.minumRamuan();
        System.out.println(hero.getNama() + " HP setelah minum ramuan: " + hero.getHp());

        hero.levelUp();
        System.out.println(hero.getNama() + " Level: " + hero.getLevel());
    }
}