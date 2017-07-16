/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasamplessudhir.class4.problem1;

/**
 *
 * @author Sudhir
 */
public class MainClass {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "sudhir", 10000, 10, 15);
        System.out.println("Employee id is " + emp.getId());
        System.out.println("Employee Name is " + emp.getName());
        System.out.println("Employee salary is " + emp.getSalary());
        System.out.println("Employee DA is " + emp.computeDA());
        System.out.println("Employee HRA is " + emp.computeHRA());
        emp.setHra_perc(120);
    }
}
