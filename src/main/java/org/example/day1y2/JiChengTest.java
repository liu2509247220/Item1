package org.example.day1y2;

public class JiChengTest {
    public static void main(String[] args) {
        JiChengDog dog = new JiChengDog();
//        dog.setName("狗");
//        dog.setHealth(100);
//        dog.setLove(45);
//        dog.setStrain("人");
//        dog.print();
//        dog.print2();
//        System.out.println(dog.getStrain());

//        JiChengPenguin penguin = new JiChengPenguin();
//        penguin.setName("企鹅");
//        penguin.setHealth(54);
//        penguin.setLove(21);
//        penguin.setLol("大苏打");
//        penguin.print();
//        System.out.println(penguin.getLol());
//        System.out.println(dog.toString());
//        System.out.println(dog.hashCode());
//        System.out.println(dog.getClass());
        System.out.println(dog instanceof JiChengDog);
        System.out.println(dog instanceof JiChengPet);
        System.out.println(dog instanceof Object);//object间接继承，”是祖宗“
    }
}
