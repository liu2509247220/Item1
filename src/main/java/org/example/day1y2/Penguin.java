package org.example.day1y2;

public class Penguin {
    public String name;
    public String gender;
    public int age;

    public void out() {
        if (age > 8) {
            System.out.println(name + age + "老年");
        } else if (age >= 3 && age <= 8) {
            System.out.println(name + age + "成年");
        } else {
            System.out.println(name + age + "幼年");
        }
    }
}
