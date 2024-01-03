package org.example.day1y2;

import java.util.Scanner;

public class BirdTest {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字品种健康值:");
        bird.name = scanner.next();
        bird.pinzhong = scanner.next();
        bird.health = scanner.nextInt();
        bird.out();
    }
}
