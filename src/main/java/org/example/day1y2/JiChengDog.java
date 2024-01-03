package org.example.day1y2;

import org.example.Class.Dog;

public class JiChengDog extends JiChengPet {
    private String strain;//品种

    public JiChengDog() {
        super("111");//super会优先使用带参构造方法
        System.out.println("dog----默认构造方法");
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

//    public void print() {
//        System.out.println(this.getName() + "," + this.getLove() + "," + this.getHealth() + "," + getStrain());
//    }
    public void print(){     //方法名与父类一样
        super.print();      //对父类方法的重写
        System.out.println(this.getStrain());
    }
}
