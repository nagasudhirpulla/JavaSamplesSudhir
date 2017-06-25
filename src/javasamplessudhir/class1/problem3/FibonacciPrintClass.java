/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class1.problem3;

import java.util.Scanner;

/**
 *
 * @author User5T1
 */
public class FibonacciPrintClass {

    /**
     * Prints Fibonacci series of given 2 numbers
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var_1, var_2, numValues;
        Scanner inp = new Scanner(System.in);
        int do_new_iteration = 0;
        do {
            System.out.println("Enter the FIRST Number");
            var_1 = inp.nextInt();
            System.out.println("Enter the SECOND Number");
            var_2 = inp.nextInt();
            System.out.println("Enter the number of values in the series");
            numValues = inp.nextInt();
            System.out.print("The Fibonacci Series is\n" + var_1 + ", " + var_2 + ", ");
            int nextNum = 0;
            for (int i = 0; i < numValues - 3; i++) {
                nextNum = var_1 + var_2;
                System.out.print(nextNum + ", ");
                var_1 = var_2;
                var_2 = nextNum;
            }
            System.out.print((var_1 + var_2) + ".\n");
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
