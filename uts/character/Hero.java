package week8.character;

public class Hero {
    protected String nama;
    protected int hp;
    protected int ramuan;
    protected int damage;
    
    public Hero(String nama, int hp) {
        this.nama = nama;
        this.hp = hp;
        this.ramuan = 3; // max ramuan 3
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    // Getter
    public String getNama() {
        return this.nama;
    }

    public int getHp() {
        return this.hp;
    }

    public int getRamuan() {
        return this.ramuan;
    }

    // Actions
    public void attack() {
        System.out.println(nama + " Menyerang musuh dengan skill 1 !");
        this.hp += 25; //ini ketika kita nyerang hp nya menjadi +25
    }

    public void defend() {
        System.out.println(nama + " Bertahan dari serangan musuh!");
        this.hp -= 10; // ini ketika bertahan atau diserang hp nya menjadi -10
    }

    public void minumRamuan() {
        if (this.ramuan > 0) {
            this.hp += 20;
            this.ramuan--;
            System.out.println(nama + " Minum ramuan! HP bertambah 20.");
        } else {
            System.out.println("Ramuan habis!");
        }
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    // Overloading untuk attack pakai skill 2 bro 
    public void attack(int damage) {
        this.hp -= damage ;
        System.out.println(nama + " Menyerang musuh dengan skill 2 !" + damage + "!");
    }
}
