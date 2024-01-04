package org.example.day1y4d1duotai;

public class Shop {

    public Goods giveGoods(int type) {
        Goods goods = null;
        if (type == 1) {
            goods = new TVs();
            goods.setPrice(2000);
        } else if (type == 2) {
            goods = new Foods();
            goods.setPrice(100);
        }
        return goods;
    }
}
