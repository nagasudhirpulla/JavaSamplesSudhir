/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class1.problem1;

import java.util.Scanner;

/**
 *
 * @author Sudhir
 */
public class JavaSamplesSudhir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1, var2, opcode;
        Scanner inp = new Scanner(System.in);
        int do_new_iteration = 0;
        do {
            System.out.println("Enter operand 1");
            var1 = inp.nextInt();
            System.out.println("Enter operand 2");
            var2 = inp.nextInt();
            System.out.println("Enter operation code");
            System.out.println("1-add; 2-substract; 3-multiply");
            opcode = inp.nextInt();
            switch (opcode) {
                case 1:
                    System.out.println("You selected 1-add");
                    System.out.println("Result is " + (var1 + var2));
                    break;
                case 2:
                    System.out.println("You selected 2-substract");
                    System.out.println("Result is " + (var1 - var2));
                    break;
                case 3:
                    System.out.println("You selected 3-multiply");
                    System.out.println("Result is " + (var1 * var2));
                    break;
                default:
                    System.out.println("Invalid operation code input");
                    break;
            }
            System.out.println("DO Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }
}
