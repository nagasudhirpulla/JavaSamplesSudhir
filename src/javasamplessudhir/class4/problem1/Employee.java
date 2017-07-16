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
public class Employee {

    private int id, salary = 0, da_perc = 0, hra_perc = 0;
    private String name;

    Employee(int id, String name, int salary, int da_perc, int hra_perc) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hra_perc = hra_perc;
        this.da_perc = da_perc;
    }

    public int computeDA() {
        return (int) (salary * da_perc * 0.01);
    }

    public int computeHRA() {
        return (int) (salary * hra_perc * 0.01);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDa_perc() {
        return da_perc;
    }

    public void setDa_perc(int da_perc) {
        this.da_perc = da_perc;
    }

    public int getHra_perc() {
        return hra_perc;
    }

    public void setHra_perc(int hra_perc) {
        this.hra_perc = hra_perc;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee(1, "sudhir", 10000, 10, 15);
        System.out.println("Employee id is " + emp.getId());
        System.out.println("Employee Name is " + emp.getName());
        System.out.println("Employee salary is " + emp.getSalary());
        System.out.println("Employee DA is " + emp.computeDA());
        System.out.println("Employee HRA is " + emp.computeHRA());
    }
}
