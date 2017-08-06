/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class5.problem1;

/**
 *
 * @author User5T1
 */
public class Chld extends Prnt {

    int var = 100;

    @Override
    void hello() {
        System.out.println("Hello from Child");
    }

    @Override
    void printVar() {
        System.out.println("Child Variable = " + var);
        super.printVar();
        //System.out.println("Hyrarchy Variables = " + var + ", " + super.var);
    }

    void helloAlt() {
        System.out.println("Another Hello from Child");
    }
}
