package org.example.day1y11.test4;

import java.util.Random;

/**
 * 生成20个10以内的随机数
 * @author 86150
 * @date 2024/1/11 16:46
 */
public class Test3Random {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(10);
            System.out.println("第" + (i + 1) + "个随机数是" + num);
        }
    }
}
