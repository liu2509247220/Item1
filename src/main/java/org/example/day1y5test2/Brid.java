package org.example.day1y5test2;

public class Brid extends Animal{

    @Override
    public void info() {
        System.out.println("种类为"+this.getKind()+"年龄为"+this.getAge());
    }

    public Brid() {

    }

    public Brid(String kind, int age) {
        super(kind, age);
    }

}
