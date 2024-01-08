package org.example.day1y5test.dongwujiao;

public class Test {
    public static void main(String[] args) {
        //多态，主类 = new
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
    }
}
