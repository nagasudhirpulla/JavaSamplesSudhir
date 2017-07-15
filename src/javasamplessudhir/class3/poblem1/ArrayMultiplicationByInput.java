/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class3.poblem1;

import java.util.Scanner;

/**
 *
 * @author user2
 */
public class ArrayMultiplicationByInput {

    /**
     * First Array Program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array_rows = 2, array_cols = 3, do_new_iteration = 0;
        int[][] a, b, c;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the array values for size 2 x 3");
            a = new int[array_rows][array_cols];
            for (int i = 0; i < array_rows; i++) {
                for (int k = 0; k < array_cols; k++) {
                    a[i][k] = inp.nextInt();
                }
            }
            System.out.print("You entered \n");
            for (int i = 0; i < array_rows; i++) {
                for (int k = 0; k < array_cols; k++) {
                    System.out.print(a[i][k] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("Enter the array values for size 3 x 2");
            b = new int[array_cols][array_rows];
            for (int i = 0; i < array_cols; i++) {
                for (int k = 0; k < array_rows; k++) {
                    b[i][k] = inp.nextInt();
                }
            }
            System.out.print("You entered \n");
            for (int i = 0; i < array_cols; i++) {
                for (int k = 0; k < array_rows; k++) {
                    System.out.print(b[i][k] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("The multiplication of two arrays is\n");
            c = new int[array_rows][array_rows];
            for (int i = 0; i < array_rows; i++) {
                for (int k = 0; k < array_rows; k++) {
                    int res = 0;
                    for (int l = 0; l < array_cols; l++) {
                        res += a[i][l] * b[l][k];
                    }
                    c[i][k] = res;
                    System.out.print(res + " ");
                }
                System.out.print("\n");
            }
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
