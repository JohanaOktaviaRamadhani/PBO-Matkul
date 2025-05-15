package week8;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        
        // BangunDatar persegi = new BangunDatar(10);
        // BangunDatar persegipanjang = new BangunDatar(5,10);
        // BangunDatar segitiga = new BangunDatar(4.5,5.5);
        // BangunDatar lingkaran = new BangunDatar(21.0);

        // persegi.luas();
        // persegipanjang.luas();
        // segitiga.luas();
        // lingkaran.luas();

        BangunDatar bangun = null;

        System.out.println("Pilih bangun datar yang ingin di hitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("Silahkan inputkan angka 1-4 : ");
        int Input= pilih.nextInt();

        if(Input ==1){
            System.out.println("Silahkan inputkan nilai sisi : ");
            int sisi= pilih.nextInt();
            bangun = new BangunDatar(sisi);
        }else if(Input==2){
            System.out.println("Silahkan inputkan nilai panjang : ");
            int panjang= pilih.nextInt();
            System.out.println("Silahkan inputkan nilai lebar : ");
            int lebar= pilih.nextInt();
            bangun = new BangunDatar(panjang,lebar);
        }else if(Input==3){
            System.out.println("Silahkan inputkan nilai alas : ");
            int alas= pilih.nextInt();
            System.out.println("Silahkan inputkan nilai tinggi : ");
            int tinggi= pilih.nextInt();
            bangun = new BangunDatar(alas,tinggi);
        }else{
            System.out.println("Silahkan inputkan nilai jari-jari : ");
            int jarijari= pilih.nextInt();
            bangun = new BangunDatar(jarijari);
        }

        System.out.println("Luas bangun datarmu adalah : ");
        bangun.luas();
    }
}