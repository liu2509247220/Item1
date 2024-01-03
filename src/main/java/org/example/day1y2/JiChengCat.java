package org.example.day1y2;

public class JiChengCat {
    //不带static的叫做实例（对象）变量，需要通过（对象）实例来访问，不能通过类名访问
    int age;

    //带static的叫静态变量（类变量），需要通过类名来访问
    static int health;

    //不带static的叫实例方法，通过对象来访问
    public void sayHello() {

    }

    //带stati 的叫做静态方法（类方法），需要类名访问
    public static void sayHello2() {

    }

    //静态代码块，在类加载的时候执行且只执行一次
    static {
        System.out.println("静态代码块被执行");
        health = 45;
    }
}
