package org.example.day1y3duotai;

public class Master {
//    public void cure(Pig pig) {
//        if (pig.getHealth() < 60) {
//            System.out.println("打针，hi要");
//            pig.setHealth(pig.getHealth() + 3);
//        }
//    }

    //重载
//    public void cure(Cat cat) {
//        if (cat.getHealth() < 70) ;
//        System.out.println("不叫，辽阳");
//        cat.setHealth(cat.getHealth() + 10);
//    }

    public void cure( Animal animal){
        animal.toHospital();
    }

}
