package org.example.chongzai;

public class Fruit {
    public void zhaZhi(String fruit) {
        System.out.println(fruit + "汁");
    }

    public void zhaZhi2(int count, String fruit) {
        System.out.println("第" + count + "杯" + fruit + "汁");
    }

    public void zhaZhi3(int[] counts, String[] fruits) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println("第" + counts[i] + "杯" + fruits[i]);
        }
    }


}
