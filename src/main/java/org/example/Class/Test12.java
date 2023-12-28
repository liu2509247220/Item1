package org.example.Class;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        String[] yuangong = new String[3];
        for (int i = 0; i < yuangong.length; i++) {
            System.out.print("输入员工" + (i + 1) + "的姓名:");
            yuangong[i] = employee.name;
            yuangong[i] = scanner.next();
            System.out.print("输入年龄:");
            employee.age = scanner.nextInt();
            System.out.print("输入性别:");
            employee.gender = scanner.next();
            System.out.print("输入薪资:");
            employee.money = scanner.nextInt();
            System.out.print("输入职位:");
            employee.work = scanner.next();
            employee.upup();

            System.out.println("名字为" + employee.name + "的薪资为" + employee.money);
        }
    }
}
