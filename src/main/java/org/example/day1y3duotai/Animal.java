package org.example.day1y3duotai;

public class Animal {
    private String name;
    private int health;

    public Animal() {
    }

    public Animal(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public void toHospital(){

    }
}
