package org.example.Class;

public class Person {
    String name;
    int age;
    String gender;

    String food;

    public void print() {
        System.out.println("姓名是:" + name + "年龄是:" + age + "性别" + gender);
    }

    public void eat() {
        System.out.println("正在吃" + food);
    }
}
