package org.example.day1y4d2;

public class Penguin extends Pet {
    @Override
    public void eat() {
        if (this.getHealth() == 100) {
            System.out.println("企鹅爆了不用喂食");
            this.setHealth(100);
        } else {
            System.out.println("给企鹅喂食");
            this.setHealth(this.getHealth() + 5);
        }
    }
}
