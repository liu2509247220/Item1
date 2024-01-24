package org.example.day1y19.test;

/**
 * @author 86150
 * @date 2024/1/19 11:20
 */
public class Admin {
private String name;
private String number;
private int age;

    public Admin(String name, String number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test31{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                '}';
    }
}
