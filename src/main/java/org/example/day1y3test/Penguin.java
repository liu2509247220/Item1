package org.example.day1y3test;

public class Penguin {
    private String name;
    private int age;
    private String sex;

    public Penguin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age < 3) {
            System.out.println(name + age + "幼年");
        } else if (age >= 3 && age <= 8) {
            System.out.println(name + age + "成年");
        } else {
            System.out.println(name + age + "老年");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
