package week2;

public class Character{
    //list of properties
    String nama ;
    int hp = 100;
    int level = 1 ;
    int exp = 0;

    //methods
    //void = tidak ada return value, bentuknya prosedur 
    public void setData (String nama, int hp, int level, int exp){
        this.nama = nama; //this ini untuk properti yg dimiliki oleh class
        this.hp = hp;
        this.level = level;
        this.exp = exp;
    }

    //MEMANGGIL RETURN 1 PERSATU
    public String getNama(){
        return this.nama; //return hanya bisa 1 properti, kalau mau >1 pakai array 
    }
    public int getHp (){
        return this.hp;
    }
    public int getLevel (){
        return this.level;
    }
    public int getExp (){
        return this.exp;
    }


    public void attack(){
        System.out.println(this.nama + " menyerang musuh");
        ExpUp();
    }
    public void ExpUp(){
        this.exp++;
    }
    public void levelUp (){
        this.exp++;
    }
    public void attacked(){
        this.hp--;
    }
}