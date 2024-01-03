package org.example.chongzai;

public class Gouzao {
    String name;
    int age;

    //如果类中没有无参构造方法，系统会在编译时默认创建
    //无参构造方法必须与类名相同，并且没有返回值
    public Gouzao() {
        //this在调用无参构造方法的时候必须在第一排
        this("liu", 18);
        System.out.println("无参构造方法");
        name = "周杰伦";
        age = 3;
    }

    //带参构造方法
    public Gouzao(String name, int age) {
        System.out.println("带参构造方法");
        //等号前面是属性/成员变量，后面是形参
        this.name = name;
        this.age = age;
//        this.sayHello();
        sayHello();
    }

    public void sayHello() {
        System.out.println("sayHello");
    }
}
