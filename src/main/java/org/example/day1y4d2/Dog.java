package org.example.day1y4d2;

public class Dog extends Pet {

    @Override
    public void eat() {
        if (this.getHealth() == 100) {
            System.out.println("健康值100不要喂食");
            this.setHealth(100);
        } else {
            System.out.println("给狗喂食");
            this.setHealth(this.getHealth() + 3);
        }
    }
}
