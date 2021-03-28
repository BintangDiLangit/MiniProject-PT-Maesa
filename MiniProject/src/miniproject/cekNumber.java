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
public class cekNumber {

    static void cek(int array[]) {
        int count[] = new int[1000];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;

        }
        for (int i = 1; i <= count.length - 1; i++) {
//            System.out.print(count[i]+",");
            if (count[i] == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 3, 2};
        cek(array);  
    }
}
