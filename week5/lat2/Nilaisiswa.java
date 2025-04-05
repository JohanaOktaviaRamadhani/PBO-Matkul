package lat2;
import java.util.ArrayList;
import java.util.Scanner;

public class Nilaisiswa {
    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void inputData() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            Siswa s = new Siswa();

            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            s.setNim(input.nextLine());

            System.out.print("Nama: ");
            s.setNama(input.nextLine());

            System.out.print("Nilai Teori: ");
            s.setTeori(input.nextDouble());

            System.out.print("Nilai Praktek: ");
            s.setPraktek(input.nextDouble());
            input.nextLine();

            daftarSiswa.add(s);
        }
    }

    public void tampilkanData() {
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        System.out.printf("%-4s %-10s %-15s %-10s %-10s %-10s\n",
                "No", "NIM", "Nama", "Teori", "Praktek", "Rata-rata");
        System.out.println("---------------------------------------------------------------");

        int no = 1;
        for (Siswa s : daftarSiswa) {
            System.out.printf("%-4d %-10s %-15s %-10.2f %-10.2f %-10.2f\n",
            no++, s.getNim(), s.getNama(), s.getTeori(), s.getPraktek(), s.getRata());
        }
    }

}
