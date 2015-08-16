/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Somchat
 */
public class CountChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_text;
        int[] charCount = new int[123];
        int otherChar;
        do {
            Arrays.fill(charCount, 0);
            otherChar = 0;
            System.out.print("Please input Text:");
            input_text = sc.next();
            for (int i = 0; i < input_text.length(); i++) {
                if (((int) input_text.charAt(i) >= 65 && (int) input_text.charAt(i) <= 90) || ((int) input_text.charAt(i) >= 97 && (int) input_text.charAt(i) <= 122)) {
                    charCount[(int) input_text.charAt(i)]++;
                } else {
                    otherChar++;
                }
            }
            for (int i = 65; i <= 90; i++) {
                if (charCount[i] != 0) {
                    System.out.println((char) i + " = " + charCount[i]);
                }

            }
            for (int i = 97; i <= 122; i++) {
                if (charCount[i] != 0) {
                    System.out.println((char) i + " = " + charCount[i]);
                }
            }
            System.out.println("Other Character = " + otherChar);
        } while (!input_text.equalsIgnoreCase("Stop"));
    }
}
