package org.example.day1y5test2;

public class Fish extends Animal{
    @Override
    public void info() {
        System.out.println("种类为"+this.getKind()+"年龄为"+this.getAge());
    }

    public Fish() {
    }

    public Fish(String kind, int age) {
        super(kind, age);
    }
}
