package week4;
public class Quiz {
    private String[] questions = {
        "Kenapa ikan tidak pernah batuk?",
        "Kenapa ayam kalau berkokok selalu tutup mata?",
        "Kenapa kereta api tidak pernah tersesat?",
        "Kenapa komputer selalu kurus?",
        "Kenapa kucing suka tidur lama?",
        "Kenapa pensil selalu punya teman?",
        "Kenapa sapi tidak pernah naik gunung?",
        "Kenapa Superman tidak pakai helm?",
        "Kenapa lampu merah selalu berhenti?",
        "Kenapa kalender selalu kurus?"
    };

    private String[][] options = {
        {"1. Karena dia hidup di air", "2. Karena dia rajin minum vitamin", "3. Karena dia sering berenang", "4. Karena dia tidak punya paru-paru"},
        {"1. Karena malu", "2. Karena takut lihat matahari", "3. Karena sudah hafal liriknya", "4. Karena fokus jadi penyanyi"},
        {"1. Karena ada rel", "2. Karena ada GPS", "3. Karena selalu baca peta", "4. Karena sering tanya jalan"},
        {"1. Karena jarang makan", "2. Karena sering di-reset", "3. Karena tidak pernah olahraga", "4. Karena selalu diet data"},
        {"1. Karena suka mimpi indah", "2. Karena sering begadang", "3. Karena lelah setelah berburu tikus", "4. Karena ingin menghemat energi"},
        {"1. Karena dia sering dicoret-coret", "2. Karena dia suka menulis cerita", "3. Karena dia selalu ada di kotak pensil", "4. Karena dia takut kesepian"},
        {"1. Karena berat badannya tidak cukup", "2. Karena dia lebih suka di padang rumput", "3. Karena dia takut ketinggian", "4. Karena dia sibuk makan rumput"},
        {"1. Karena helmnya terlalu berat", "2. Karena rambutnya sudah anti peluru", "3. Karena dia bisa terbang", "4. Karena tidak ada yang jual helm untuk pahlawan"},
        {"1. Karena dia lelah", "2. Karena dia tidak suka warna hijau", "3. Karena dia harus menjalankan tugasnya", "4. Karena dia takut dimarahi polisi"},
        {"1. Karena jarang makan", "2. Karena setiap bulan dia kehilangan berat badan", "3. Karena dia terlalu banyak angka", "4. Karena dia kebanyakan tanggal merah"}
    };

    private int[] correctAnswers = {1, 3, 1, 4, 4, 3, 2, 3, 3, 2};

    private int score = 0;
    
   
    public int getQuestionCount() {
        return questions.length;
    }
    
    
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + 
                options[index][correctAnswers[index] - 1]);
        }
    }
    
    // Method untuk mendapatkan skor
    public int getScore() {
        return score;
    }
}