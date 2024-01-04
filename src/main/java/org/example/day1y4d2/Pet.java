package org.example.day1y4d2;

public abstract class Pet {
    private int health;

    public Pet() {
    }

    public Pet(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "health=" + health +
                '}';
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public abstract void eat();
}
