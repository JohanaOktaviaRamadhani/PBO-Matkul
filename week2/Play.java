package week2;

public class Play
{
    public static void main(String[] arfs)
    {
        //membuat objek
        Character player1 = new Character(); //kalau buat karakter harus ada kata new
        player1.setData("Squall",888,2,3); //integer tdk boleh diawali dg angka 0
        
        //menampilkan hasil 
        System.out.println("Informasi Player");
        System.out.println("Nama: "+player1.getNama());
        System.out.println("Hp: "+player1.getHp());
        System.out.println("Level: "+player1.getLevel());
        System.out.println("Exp: "+player1.getExp());

        System.out.println("\n");
        player1.attack();
        player1.attack();
        player1.attack();
        player1.attack();
        player1.attack();
        player1.levelUp();

        System.out.println("\n === Informasi Player after attack 5x & levelup 1x ===");
        System.out.println("Nama: "+player1.getNama());
        System.out.println("Hp: "+player1.getHp());
        System.out.println("Level: "+player1.getLevel());
        System.out.println("Exp: "+player1.getExp());

        player1.attacked();
        player1.attacked();
        System.out.println("\n === Informasi Player after attacked 2x ===");
        System.out.println("Nama: "+player1.getNama());
        System.out.println("HP: "+player1.getHp());
        System.out.println("Level: "+player1.getLevel());
        System.out.println("Exp: "+player1.getExp());







    }
}