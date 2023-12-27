package org.example.Class;

public class Test003 {
    String name;
    int age;
    public void piao(){
        if (age>=18){
            System.out.println(name+"的年龄为"+age+",门票价格为20元");
        }else {
            System.out.println(name+"的年龄为"+age+"门票免费");
        }
    }
}
