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
public class kelipatan {

    static void cara1(int angka) {
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {

                System.out.print(i);
            }
            System.out.println("");
        }
    }

    static void cara2(int angka) {
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FizzBuzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {

                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        //        Cara 1
        cara1(100);

        System.out.println("===========================");
        //        Cara 2
        cara2(100);
    }
}
