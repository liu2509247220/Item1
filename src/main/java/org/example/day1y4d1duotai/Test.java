package org.example.day1y4d1duotai;

public class Test {
    public static void main(String[] args) {
        Shop shop =new Shop();
        Goods goods = shop.giveGoods(1);
        goods.printPrise();

        goods=shop.giveGoods(2);
        goods.printPrise();
    }
}
