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
public class PalindromePrintClass {

    /**
     * Prints Palindrome of a given number
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
            int temp_var_1 = var_1;
            int rev_var_1 = 0;
            boolean runIteration = true;
            while (runIteration) {
                rev_var_1 += temp_var_1 % 10;
                temp_var_1 = temp_var_1 / 10;
                if (temp_var_1 != 0) {
                    rev_var_1 *= 10;
                } else {
                    runIteration = false;
                }
            }
            if (rev_var_1 == var_1) {
                System.out.println("The number " + var_1 + " is a palindrome");
            } else {
                System.out.println("The number " + var_1 + " is NOT a palindrome");
            }

            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
