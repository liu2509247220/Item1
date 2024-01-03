package org.example.day1y2;

import java.util.Scanner;

public class PenguinTest {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名+年龄");
        penguin.name = scanner.next();
        penguin.age = scanner.nextInt();
        penguin.out();
    }
}
