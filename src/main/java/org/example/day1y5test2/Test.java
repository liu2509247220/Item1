package org.example.day1y5test2;

public class Test {
    public static void main(String[] args) {
        Chaxun chaxun = new Chaxun();
        Animal animal = new Brid();
        animal.setAge(10);
        animal.setKind("鸟");
        chaxun.cha(animal);

        animal = new Fish();
        animal.setAge(10);
        animal.setKind("鱼");
        chaxun.cha(animal);
    }


}
