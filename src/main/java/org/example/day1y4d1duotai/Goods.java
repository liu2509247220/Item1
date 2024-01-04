package org.example.day1y4d1duotai;

public  abstract class Goods {
    private int price;

    public Goods() {
    }

    public Goods(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                '}';
    }

    public abstract void printPrise();
}
