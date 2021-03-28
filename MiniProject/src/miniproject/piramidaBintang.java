/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

/**
 *
 * @author BintangDiLangit
 */
public class piramidaBintang {

    /**
     * @param args the command line arguments
     */
    static void piramida(int bintang){
                int a,b,c,d;
        for (a = 1; a <=bintang; a++) {
            //outerloop
            for ( b = bintang-1; b >= a; b--) {
                //inner loop no 1
                System.out.print(" ");
                /*Untuk memberikan space (membuat 
                segitiga siku2 terbalik)*/
            }
            
            for ( c = 1; c <=a; c++) {
                //inner loop no 2
                System.out.print("*");
                //menampilkan * dari kanan ke kiri (sisi Kiri)
            }
            for ( d = 1; d <= a-1; d++) {
                //inner loop no 3
                System.out.print("*");  
                //menampilkan * dari kiri ke kanan (sisi Kanan)
            }
            System.out.println();
            //Memberikan baris baru
        }
    }
    public static void main(String[] args) {
        piramida(8);
    }
    
}
