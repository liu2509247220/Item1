package org.example.day1y3duotai;

public class AnimalTest {
    public static void main(String[] args) {
        Master master = new Master();
        Pig pig = new Pig("猪", 57);
        master.cure(pig);
        System.out.println(pig);


        Cat cat = new Cat("猫",50);
        master.cure(cat);
        System.out.println(cat);
    }
}
