/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class5.problem1;

public class OverrideExample {

    public static void main(String[] args) {
        Prnt p = new Prnt();
        p.hello();
        p.printVar();
        
        p = new Chld();
        p.hello();
        ((Chld)p).helloAlt();
        p.printVar();
        
        p = new GrndChld();
        p.hello();
        ((Chld)p).helloAlt();
        ((GrndChld)p).helloNew();
        p.printVar();
    }
}
