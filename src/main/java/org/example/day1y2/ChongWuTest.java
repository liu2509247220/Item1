package org.example.day1y2;

import java.util.Scanner;

public class ChongWuTest {
    public static void main(String[] args) {

        ChongWu chongWu = new ChongWu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到宠物店");
        System.out.println("输入要领养的宠物:(1、狗2、企鹅)");
        chongWu.setName(scanner.next());
        System.out.println("请选择"+chongWu.getName()+"的性别:(1、男2、母)");
        chongWu.setKinds(scanner.nextInt());
        System.out.println("输入企鹅的健康值1-100，默认60");
        chongWu.setHealth(scanner.nextInt());
        System.out.println("宠物自爆");
        System.out.println("我的名字叫"+chongWu.getName()+"健康"+chongWu.getHealth()+"亲密度是0"+"性别是"+chongWu.getGender());

        
    }
}
