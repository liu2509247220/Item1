package org.example.day1y4d3jiekou;

public class Student implements Aaaa{
    //implements接口多继承，Aaaa，Bbbb
    //实现类必须实现接口中的所有方法
    @Override
    public void say1() {

    }

    @Override
    public void say4() {
        System.out.println("我是覆盖之后的默认方法");
        Aaaa.super.say4();

    }
}
