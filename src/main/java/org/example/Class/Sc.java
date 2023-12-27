package org.example.Class;

public class Sc {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 18;
        person.name = "灰太狼";
        person.gender = "男";

        person.food = "米饭";
        person.print();
        person.eat();

        More more = new More();
        more.bool = "足球";
        more.wan();
    }

}
