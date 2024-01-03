package org.example.day1y3test;

import java.util.Scanner;

public class PenguinTest {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字:");
        penguin.setName(scanner.next());
        System.out.println("输入年龄:");
        penguin.setAge(scanner.nextInt());
        penguin.getAge();
    }
}
