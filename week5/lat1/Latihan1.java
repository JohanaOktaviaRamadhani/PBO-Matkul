package lat1;
import java.util.Scanner;

public class Latihan1 {
    private int[] nilai;
    private Scanner input = new Scanner(System.in);

    public void inputData() {

        //Untuk mengatur supaya user bisa costume mau brp banyak data
        System.out.print("Jumlah Data : ");
        int jumlahData = input.nextInt();

        nilai = new int[jumlahData];

        //looping untuk input data
        for(int i = 0; i < nilai.length; i++) {
            System.out.print("Data ke - " + (i+1) + " = ");
            nilai[i] = input.nextInt();
        }
    }

    //looping untuk menampilkan data
    public void tampilkanData() {
        System.out.println(); 
        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Hasil nilai[" + i + "]= " + nilai[i]);
        }
    }

    public void closeScanner() {
        input.close();
    }
}
