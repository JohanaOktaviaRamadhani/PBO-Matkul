package week4;

class Array {
    public static void main (String[] args){

        //ARRAY INT
        int[] angka = new int[6];
        angka[1] = 6;
        angka[5] = 3;

        for(int i =0; i < angka.length; i++){
            if(angka[i]>0){
                System.out.println("Dari array angka index ke " + (i+1) + " adalah : " + angka[i] + ",");
            }

        }

        System.out.println("");


        //ARRAY STRING
        String[] kata = {"udang","tembok","lembah","bani"};

        for(int i =0; i < kata.length; i++){ 
            //loop for untuk yg sudah diketahui brp x loopnya
            //loop for hanya bisa untuk tipe data angka
            if(kata[i] != "")
            {
                System.out.println("Dari array kata index ke " + (i+1) + " adalah : " + kata[i] + ",");
            }

        }

        System.out.println("");


        //ARRAY 2 DIMENSI
        int [][] matriks = {
            {5,4,2,1},
            {9,6,1,5},
            {7,5,3,1}
        };

        for(int i=0; i<3; i++){ //angka 4 bisa diganti dengan matriks.length biar dinamis
            for(int j=0; j< 4; j++){ //angka 4 bisa diganti dengan matriks[i].length biar dinamis
                System.out.print(matriks[i][j]+",");
            }
            System.out.println("");
        }

        System.out.println("");

        //versi dinamis
        for(int i=0; i<matriks.length; i++){ 
            for(int j=0; j< matriks[i].length; j++){ 
                System.out.print(matriks[i][j]+",");
            }
            System.out.println("");
        }
    }
}