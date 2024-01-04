package org.example.day1y4d1duotai;

public class TVs extends Goods{

    public TVs() {
    }

    public TVs(int price) {
        super(price);
    }

    @Override
    public void printPrise() {
        System.out.println("电视机的价格为:"+super.getPrice());
    }
}
