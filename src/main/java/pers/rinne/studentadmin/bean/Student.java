package pers.rinne.studentadmin.bean;

public class Student extends Person {

    public Student() {
    }

    public Student(String name, String sex) {
        super(name, sex);
    }

    public Student(int id, String name, String sex) {
        super(id, name, sex);
    }
}
