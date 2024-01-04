package org.example.day1y4d3jiekou;

public interface Bbbb {

    public void say2();
    default void say4(){
        System.out.println("我是默认方法bbbb");
    }
}
