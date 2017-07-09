/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class2.poblem2;

import java.util.Scanner;

/**
 *
 * @author User5T1
 */
public class MultipleInputsWithArray {

    /**
     * First Array Program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array_size = 0;
        int[] a;
        Scanner inp = new Scanner(System.in);
        int do_new_iteration = 0;
        do {
            System.out.println("Enter the array size");
            array_size = inp.nextInt();
            a = new int[array_size];
            System.out.println("Enter the array values");
            for (int i = 0; i < a.length; i++) {
                a[i] = inp.nextInt();
            }
            System.out.print("You entered ");
            int maxVal = a[0];
            int minVal = a[0];
            for (int i = 0; i < a.length; i++) {
                if (maxVal < a[i]) {
                    maxVal = a[i];
                }
                if (minVal > a[i]) {
                    minVal = a[i];
                }
                System.out.print(a[i] + " ");
            }
            System.out.println("");
            System.out.println("The maximum value is " + maxVal);
            System.out.println("The minimum value is " + minVal);
            System.out.print("The values divisible by 3 and 5 are ");
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 5 == 0 && a[i] % 3 == 0) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.print("\n");
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
