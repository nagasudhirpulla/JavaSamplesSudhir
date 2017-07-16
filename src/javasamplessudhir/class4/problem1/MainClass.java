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
        Student stdnt = new Student(1, "sudhir", 18, true);
        Student.setCollegeName("NITW");
        System.out.println("Student id is " + stdnt.getId());
        System.out.println("Student Name is " + stdnt.getName());
        System.out.println("Student age is " + stdnt.getAge());
        System.out.println("Student gender is " + (stdnt.isMale() ? "Male" : "Female"));
        System.out.println("Student College is " + Student.getCollegeName());
    }
}
