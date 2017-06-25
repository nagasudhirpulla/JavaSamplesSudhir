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
public class JavaSamplesSudhir {

    /**
     * Reverse Pasting of 20 numbers
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
            for (int i = 0; i < 20; i++) {
                System.out.print((var_1 - i) + ", ");
            }
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
