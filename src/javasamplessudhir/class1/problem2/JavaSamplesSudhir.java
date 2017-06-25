/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class1.problem2;

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
        int probcode;
        Scanner inp = new Scanner(System.in);
        int do_new_iteration = 0;
        do {
            System.out.println("Select Problem to solve");
            System.out.println("1.Even/Odd\n2.Possitive/Negative\n3.Matured/UnMatured\n4.Leap Year\n5.Greatest in 3");
            probcode = inp.nextInt();
            switch (probcode) {
                case 1:
                    System.out.println("You selected 1. EvenOdd Problem");
                    doEvenOddProblemSolving();
                    break;
                case 2:
                    System.out.println("You selected 1. Possitive/Negative Problem");
                    doPossitiveNegativeProblemSolving();
                    break;
                case 3:
                    System.out.println("You selected 3.Matured/UnMatured Problem");
                    doMaturedUnmaturedProblemSolving();
                    break;
                case 4:
                    System.out.println("You selected 4.Leap Year Problem");
                    doIsLeapYearProblemSolving();
                    break;
                case 5:
                    System.out.println("You selected 5.Greatest in 3 Problem");
                    doGreatestInThreeProblemSolving();
                    break;
                default:
                    System.out.println("Invalid problem code input");
                    break;
            }
            System.out.println("select Problem Type Again - 1, Exit - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
        System.out.println("Exiting the code");
    }

    static void doEvenOddProblemSolving() {
        int operand_1;
        int do_new_iteration = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the number");
            operand_1 = inp.nextInt();
            if (operand_1 % 2 == 0) {
                System.out.println("The number " + operand_1 + " is EVEN");
            } else {
                System.out.println("The number " + operand_1 + " is ODD");
            }
            System.out.println("Solve Even/Odd Again - 1, No - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
    }

    static void doPossitiveNegativeProblemSolving() {
        int operand_1;
        int do_new_iteration = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the number");
            operand_1 = inp.nextInt();
            if (operand_1 > 0) {
                System.out.println("The number " + operand_1 + " is POSITIVE");
            } else {
                System.out.println("The number " + operand_1 + " is NEGATIVE");
            }
            System.out.println("Solve Possitive/Negative Again - 1, No - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
    }

    static void doMaturedUnmaturedProblemSolving() {
        int operand_1;
        int do_new_iteration = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the age");
            operand_1 = inp.nextInt();
            if (operand_1 > 0) {
                if (operand_1 > 18) {
                    System.out.println("The age " + operand_1 + " is MATURE");
                } else {
                    System.out.println("The age " + operand_1 + " is UNMATURE");
                }
            } else {
                System.out.println("The age " + operand_1 + " is invalid");
            }
            System.out.println("Solve Matured/Unmatured Again - 1, No - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
    }

    static void doIsLeapYearProblemSolving() {
        int operand_1;
        int do_new_iteration = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the year");
            operand_1 = inp.nextInt();
            if (operand_1 > 0) {
                if (operand_1 % 4 == 0) {
                    System.out.println("The year " + operand_1 + " is LEAP year");
                } else {
                    System.out.println("The year " + operand_1 + " is NON-LEAP year");
                }
            } else {
                System.out.println("The year " + operand_1 + " is invalid");
            }
            System.out.println("Solve Leap Year Problem Again - 1, No - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
    }

    static void doGreatestInThreeProblemSolving() {
        int operand_1;
        int operand_2;
        int operand_3;
        int do_new_iteration = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the FIRST number");
            operand_1 = inp.nextInt();
            System.out.println("Enter the SECOND number");
            operand_2 = inp.nextInt();
            System.out.println("Enter the THIRD number");
            operand_3 = inp.nextInt();
            if (operand_1 > operand_2 && operand_1 > operand_3) {
                System.out.println("FIRST numer is the largest among " + operand_1 + "," + operand_2 + "," + operand_3);
            } else if (operand_2 > operand_3) {
                System.out.println("SECOND numer is the largest among " + operand_1 + "," + operand_2 + "," + operand_3);
            } else {
                System.out.println("THIRD numer is the largest among " + operand_1 + "," + operand_2 + "," + operand_3);
            }
            System.out.println("Solve Greatest In Three Problem Again - 1, No - any number");
            do_new_iteration = inp.nextInt();
        } while (do_new_iteration == 1);
    }
}
