/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week3;

/**
 *
 * @author Student Lab
 */
public class TestAnythings {

    public static void main(String[] args) {
        String x = new String("ABCD");
        String y = new String("ABCD");
        String s = null;
        char ch = x.charAt(2);
        System.out.println("ch = " + ch);

        char ch2 = y.charAt(2);
        System.out.println("ch = " + ch2);

        /*char ch3 = s.charAt(2);
         System.out.println(s);*/
        String n = "12.59";
        double d = Double.parseDouble(n) * 2.0;

        System.out.println("d = " + d);
        System.out.println(Integer.toHexString(255));
        System.out.println("abcd:" + 5 + 3);
        System.out.println("abcd:" + (5 - 3));
        System.out.println("x==y "+(x==y));
        System.out.println("x equals y? " + x.equals(y));
        
    }
}
