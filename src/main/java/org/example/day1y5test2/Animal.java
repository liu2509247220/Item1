package org.example.day1y5test2;

public abstract class Animal {
    private String kind;
    private int age;

    public Animal() {
    }

    public Animal(String kind, int age) {
        this.kind = kind;
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void info();
}
