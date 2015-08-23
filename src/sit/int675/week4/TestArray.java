/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week4;

/**
 *
 * @author Student Lab
 */
public class TestArray {
    public static void main(String[] args) {
        int [] numbers ={10,20,30,40,50,60};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"Jame","Somchat","Marry","Duke"};
        for (String x : names) {
            System.out.print(x);
            System.out.print(",");
        }
    }
    
}
