package org.example.chongzai;

public class Testgouzao {
    public static void main(String[] args) {
        Gouzao gouzao1 = new Gouzao("dasd",64);
        Gouzao gouzao2 = new Gouzao("wdasd",654);
        Gouzao gouzao = new Gouzao();

//        gouzao1.name = "loi";
//        gouzao1.age = 54;
//        gouzao2.name = "sda";
//        gouzao2.age = 546;

        Gouzao[] persons = {gouzao1, gouzao2,gouzao};
        for (Gouzao s : persons) {
            System.out.println(s.name + "," + s.age);
        }
    }
}
