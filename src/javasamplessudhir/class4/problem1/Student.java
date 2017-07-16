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
public class Student {

    private int id, age;
    private boolean male;
    private String name;
    private static String CollegeName;

    public Student(int id, String name, int age, boolean isMale) {
        this.id = id;
        this.age = age;
        this.male = isMale;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollegeName() {
        return CollegeName;
    }

    public static void setCollegeName(String CollegeName) {
        Student.CollegeName = CollegeName;
    }

}
