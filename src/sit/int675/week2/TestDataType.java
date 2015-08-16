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
public class TestDataType {

    public static void main(String[] args) {
        int i = 0;
        int j;
        i = i + 1;
        float grade = (float) 4.5;
        float x = 5 / 2 + 3;//Operation must declare memory as max data type of operand
        float y = 5.0f / 2 + 3;
        long n = 1_251_111_111_111_111L;
        /*********Array*********/
        int MAX = 5;
        boolean bit[] = new boolean[MAX];
        float[] value, value2;
        value = new float[2 * 3];
        value2 = new float[2 * 3];
        int[] number = {10, 9, 8, 7, 6};
        int xx[][] = new int[5][];
        value2[5] = 8.2f;
        xx[0] = new int[7];
        xx[1] = new int[2];
        xx[2] = new int[4];
        xx[3] = new int[9];

        xx[0][6] = 6;
        xx[1][1] = 8;

        System.out.println(bit[0]);
        System.out.println(value[5]);
        System.out.println(value2[5]);
        System.out.println(number[3]);
        System.out.println(xx[0][6]);
        System.out.println(xx[1][1]);
        /**********************/

        System.out.println(grade);
        System.out.println(x);
        System.out.println(y);
        System.out.println(y);
        System.out.println(n);
        System.out.println(n * 2);
        System.out.println(i);
    }

}
