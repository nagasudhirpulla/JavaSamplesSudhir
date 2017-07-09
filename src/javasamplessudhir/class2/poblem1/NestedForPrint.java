/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class2.poblem1;

import java.util.Scanner;

/**
 *
 * @author User5T1
 */
public class NestedForPrint {

    /**
     * Nested Printing
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var_1 = 0;
        Scanner inp = new Scanner(System.in);
        int do_new_iteration = 0;
        do {
            System.out.println("Enter the levels");
            var_1 = inp.nextInt();
            System.out.print("\n");
            int max_spaces = (int) Math.floor(Math.log(var_1) / Math.log(10));
            for (int i = 1; i <= var_1; i++) {
                System.out.print(i);
                for (int k = 0; k < max_spaces - ((int) Math.floor(Math.log(i) / Math.log(10))); k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < var_1 - i; k++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(" *");
                }
                System.out.print("\n");
            }
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
