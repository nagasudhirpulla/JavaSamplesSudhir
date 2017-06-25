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
public class SigmaPrintClass {

    /**
     * Prints Sigma 1 to variable number
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
            int res = 0;
            for (int i = 1; i <= var_1; i++) {
                res += i;
            }
            System.out.println("Sigma from 1 to " + var_1 + " is " + res);
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
