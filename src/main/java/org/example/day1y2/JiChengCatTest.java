package org.example.day1y2;

public class JiChengCatTest {
    public static void main(String[] args) {
        JiChengCat cat = new JiChengCat();
        JiChengCat cat1 = new JiChengCat();
        //实例变量↓通过对象访问
        cat.age = 12;

        //实例方法↓通过对象访问
        cat.sayHello();

        //静态变量↓通过类名访问
        JiChengCat.health = 2;

        //静态方法↓类名访问
        JiChengCat.sayHello2();

    }
}
