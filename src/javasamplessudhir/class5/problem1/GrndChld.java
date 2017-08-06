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
public class GrndChld extends Chld {

    int var = 10;

    @Override
    void hello() {
        System.out.println("Hello from Grand Child");
    }

    @Override
    void helloAlt() {
        System.out.println("Another Hello from Grand Child");
    }

    @Override
    void printVar() {
        System.out.println("Grand Child Variable = " + var);
        super.printVar();
    }

    void helloNew() {
        System.out.println("New Hello from Grand Child");
    }
}
