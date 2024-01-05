package org.example.day1y5test;

public abstract class Animal {
    private int times;

    public Animal() {
    }

    public Animal(int times) {
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "times=" + times +
                '}';
    }
    public abstract void makeSound();


}
