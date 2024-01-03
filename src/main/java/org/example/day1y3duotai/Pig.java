package org.example.day1y3duotai;

public class Pig extends Animal {
    public Pig() {
    }

    public Pig(String name, int health) {
        super(name, health);
    }

    @Override
    //重写animal的方法
    public void toHospital() {
        if (this.getHealth() < 60) {
            System.out.println("打针吃药");
            this.setHealth(this.getHealth() + 3);
        }
    }
}
