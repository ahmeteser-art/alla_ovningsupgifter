package se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model1;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}