package week3;
import java.util.Scanner;

public class Inputan {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = s.nextInt();
        // nextInt = sebuah method untuk memasukkan/mengambil nilai dr inputan sblmnya
        // int yang belakang = menunjukkan tipe data
        // semisal string ya s.next, semisal double ya nextDouble

        if(angka % 2 == 0){
            System.out.println("Bilangan genap");
        }else{
            System.out.println("Bilangan ganjil");
        }

        //Contoh penerapan next di tipe data lain
        System.out.println("Masukkan nama : ");
        String nama = s.next();
        System.out.println("My name is "+nama);

        System.out.println("Masukkan IPK : ");
        double ipk = s.nextDouble();
        System.out.println("IPK semester ini "+ipk);

    }
}