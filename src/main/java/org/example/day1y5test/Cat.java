package org.example.day1y5test;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("猫在叫"+super.getTimes());
    }
    public Cat(int times){
        super(times);
    }
}
