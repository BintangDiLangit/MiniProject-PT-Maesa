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
public class palindrome {

    public static void main(String[] args) {
        palindrome("katak");
        palindrome("bintang");
        palindrome("buaya");
        palindrome("kasur ini rusak");
    }

    static void palindrome(String teks) {
        String balik = "";
        for (int i = teks.length() - 1; i > -1; i--) {
            char c = teks.charAt(i);
            balik += String.valueOf(c);
        }

        if (teks.equals(balik)) {
            System.out.println(balik + " = " + teks + " => Palindrome");
            System.out.println("============================");
        } else {
            System.out.println(balik + " != " + teks + " => bukan Palindrome");
            System.out.println("============================");
        }
    }
}
