package week8;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        BangunDatar persegi = new BangunDatar(10);
        BangunDatar persegipanjang = new BangunDatar(5,10);
        BangunDatar segitiga = new BangunDatar(4.5,5.5);
        BangunDatar lingkaran = new BangunDatar(21.0);

        persegi.luas();
        persegipanjang.luas();
        segitiga.luas();
        lingkaran.luas();


    }
}