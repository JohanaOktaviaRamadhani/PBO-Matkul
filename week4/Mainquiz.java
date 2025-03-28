package week4;
import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Quiz tebakan = new Quiz();
        System.out.println("Haiii... Welcome to my game guys!");

        int answer;

        // Looping pertanyaan
        for (int i = 0; i < tebakan.getQuestionCount(); i++) {
            // Looping pertanyaan
            tebakan.displayQuestion(i);
            
            // Tanya jawaban
            System.out.print("Jawaban anda : " );
            answer = inputan.nextInt();

            // Check for answer
            tebakan.checkAnswer(i,answer);
        }
        
        // Output Akhir
        System.out.println("");
        System.out.print("Score anda : " + tebakan.getScore() + ". ");

        // Kasi pesan
        System.out.println("");
        if (tebakan.getScore() == 0) {
            System.out.println("Jawabanmu semuanya salah, coba lagi ya!");
        } else if (tebakan.getScore() == (tebakan.getQuestionCount() * 10)) {
            System.out.println("Luar biasa! Semua jawabanmu benar, kamu memang cerdas!");
        } else {
            System.out.println("Lumayan! Beberapa jawabanmu benar, tetap semangat!");
        }
    }

}