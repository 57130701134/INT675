/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Scanner;

/**
 *
 * @author Somchat
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_num;
        do {
            do_loop:
            {
                System.out.print("Please input number:");
                input_num = sc.nextInt();
                for (int i = 2; i <= input_num / 2; i++) {
                    if (input_num % i == 0) {
                        System.out.println(input_num + " is not prime number");
                        break do_loop;
                    }
                }
                if (input_num != 0) {
                    System.out.println(input_num + " is prime number");
                }
            }
        } while (input_num != 0);

    }
}
