package org.example.Class;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入");
        for (int i = 0; i < 3; i++) {
            System.out.println("姓名");
            person.name = scanner.next();
            System.out.println("年龄");
            person.age = scanner.nextInt();
            System.out.println("性别");
            person.gender = scanner.next();
            System.out.println("爱好");
            person.hobby = scanner.next();
            System.out.println("籍贯");
            person.home = scanner.nextInt();
            person.show();
        }
    }
}
