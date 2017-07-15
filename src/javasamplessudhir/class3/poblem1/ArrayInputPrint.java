/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class3.poblem1;

import java.util.Scanner;

/**
 *
 * @author sudhir
 */
public class ArrayInputPrint {

    /**
     * First Array Program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array_rows = 2;
        int array_cols = 3;
        int[][] a;
        Scanner inp = new Scanner(System.in);
        int do_new_iteration = 0;
        do {
            System.out.println("Enter the array values for size 2 x 3");
            a = new int[array_rows][array_cols];
            for (int i = 0; i < array_rows; i++) {
                for (int k = 0; k < array_cols; k++) {
                    a[i][k] = inp.nextInt();
                }
            }
            System.out.print("You entered \n");
            int maxVal = a[0][0];
            int minVal = a[0][0];
            for (int i = 0; i < array_rows; i++) {
                for (int k = 0; k < array_cols; k++) {
                    if (maxVal < a[i][k]) {
                        maxVal = a[i][k];
                    }
                    if (minVal > a[i][k]) {
                        minVal = a[i][k];
                    }
                    System.out.print(a[i][k] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("The maximum value is " + maxVal);
            System.out.println("The minimum value is " + minVal);
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
