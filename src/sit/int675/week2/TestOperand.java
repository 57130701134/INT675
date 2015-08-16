/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week2;

/**
 *
 * @author Student Lab
 */
public class TestOperand {

    public static void main(String[] args) {
        int x, y;
        int b;
        y = 5 + 2 / 3 - 1 + 8 % 3;
        System.out.println("y = " + y);
        x = 5;
        y = x++/*5*/ + ++x/*7*/ * 3;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        
        b=-3;
        System.out.println(b>>>2);
    }

}
