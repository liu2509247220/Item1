package org.example.day1y4d1duotai;

public class Foods extends Goods{
    public Foods() {
    }

    public Foods(int price) {
        super(price);
    }

    @Override
    public void printPrise() {
        System.out.println("视频的价格为:"+super.getPrice());
    }
}
