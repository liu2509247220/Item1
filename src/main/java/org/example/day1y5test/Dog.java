package org.example.day1y5test;

public class Dog extends Animal{


    @Override
    public void makeSound() {
        System.out.println("狗在制造噪音"+super.getTimes());
    }

    public Dog(int times){
        super(times);
    }

}
