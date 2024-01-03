package org.example.day1y3test;

import java.util.Scanner;

public class BirdTest {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字品种健康值:");
        bird.setName(scanner.next());
        bird.setPinzhong(scanner.next());
        bird.setHealth(scanner.nextInt());
        bird.getHealth();
    }
}
