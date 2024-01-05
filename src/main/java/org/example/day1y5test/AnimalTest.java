package org.example.day1y5test;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalJiao animalJiao = new AnimalJiao();
        Animal animal = animalJiao.jiaojiao(1);
        animal.makeSound();

        animal = animalJiao.jiaojiao(2);
        animal.makeSound();

    }
}
