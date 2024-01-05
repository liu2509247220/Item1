package org.example.day1y5test;

public class AnimalJiao {
    public Animal jiaojiao (int type){
        Animal animal =null;
        if (type==1){
            animal =new Dog(4);
//            animal.setTimes(1);
        }else if (type ==2){
            animal = new Cat(3);
//            animal.setTimes(2);
        }
        return animal;
    }
}
