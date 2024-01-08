package org.example.day1y8.test3;

public class Car implements Input {
    float num;

    public Car(float num) {
        this.num = num;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    @Override
    public String display() {
        return "汽车油量" + 15.0;
    }
}
