package org.example.day1y2;

//父类 宠物类
public class JiChengPet {

    private String name;
    private int health;
    private int love;

    public JiChengPet() {
        System.out.println("默认构造方法------pet");
    }

    public JiChengPet(String name) {
        this.name = name;
        System.out.println("pet---------带参构造方法");//super会优先使用带参构造方法
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void print() {
        System.out.println(name + "," + health + "," + love);
    }
}
