package org.example.day1y3duotai;

public class AnimalTest {
    public static void main(String[] args) {
        Master master = new Master();
        //Animal变量的类型是Animal，但真实存储的对象是Pig对象
        Animal animal = new Pig("猪", 57);
        master.cure(animal);
        System.out.println(animal);


        Cat cat = new Cat("猫",50);
        master.cure(cat);
        System.out.println(cat);
    }
}
