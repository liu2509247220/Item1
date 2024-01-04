package org.example.day1y4d2;

public class Test {
    public static void main(String[] args) {
        Master master = new Master();

        //pet变量是Pet，但真是存放的对象是Dog
        //向上转型，小转大
        //父类引用，子类变量
        //此时通过父类引用变量无法调用子类特有的方法
        Pet pet = new Dog();
        pet.setHealth(94);
        master.giveFood(pet);

        pet = new Penguin();
        pet.setHealth(100);
        master.giveFood(pet);
    }
}
