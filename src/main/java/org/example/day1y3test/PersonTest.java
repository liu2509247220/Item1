package org.example.day1y3test;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名：");
        person.setName(scanner.next());
        System.out.println("输入年龄:");
        person.setAge(scanner.nextInt());
        System.out.println("输入性别:");
        person.setGender(scanner.next());
        System.out.println("输入爱好:");
        person.setHobby(scanner.next());

        person.out();
    }
}
