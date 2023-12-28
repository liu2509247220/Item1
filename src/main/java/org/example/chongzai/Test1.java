package org.example.chongzai;

public class Test1 {
    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.zhaZhi("苹果");
        fruit.zhaZhi("橘子");
        fruit.zhaZhi("梨子");


        fruit.zhaZhi2(10, "大大");

        int[] counts = {10, 20, 30};
        String[] fruits = {"苹果", "橘子", "李子"};
        for (int i = 0; i < fruits.length; i++) {
            fruit.zhaZhi2(counts[i], fruits[i]);
        }


        fruit.zhaZhi3(counts, fruits);
    }
}
