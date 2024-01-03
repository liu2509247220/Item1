package org.example.day1y3duotai;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1,"张三",20);
        Student student2 = new Student(1,"张三",22);
        System.out.println(student1.equals(student2));
        System.out.println(student1);

    }
}
