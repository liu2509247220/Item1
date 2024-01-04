package org.example.day1y4d3jiekou;

public interface Aaaa {
    int num = 10;
    public void say1();

    default void say4(){
        System.out.println("我是默认方法aaaa");
    }
    public static void say7(){
        System.out.println("我是静态方法");
    }
}
