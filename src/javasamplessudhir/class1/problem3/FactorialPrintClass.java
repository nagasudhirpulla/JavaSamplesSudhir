/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class1.problem3;

import java.util.Scanner;

/**
 *
 * @author Sudhir
 */
public class FactorialPrintClass {

    /**
     * Prints the factorial of a number
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var_1;
        Scanner inp = new Scanner(System.in);
        int do_new_iteration = 0;
        do {
            System.out.println("Enter the Number");
            var_1 = inp.nextInt();
            if (var_1 < 0) {
                System.out.println("No Factorial for negative number...");
            } else {
                int res = 1;
                for (int i = var_1; i > 1; i--) {
                    res *= i;
                }
                System.out.println("Factorial for " + var_1 + " is " + res);
            }
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
