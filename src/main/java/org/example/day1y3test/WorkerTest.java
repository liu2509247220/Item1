package org.example.day1y3test;

import java.util.Scanner;

public class WorkerTest {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入编号");
        worker.setNumber(scanner.nextInt());
        System.out.println("输入姓名");
        worker.setName(scanner.next());
        System.out.println("输入姓bie");
        worker.setSex(scanner.next());
        System.out.println("输入年龄");
        worker.setAge(scanner.nextInt());
        System.out.println("输入职位");
        worker.setZhiwei(scanner.next());
        System.out.println("输入薪水");
        worker.setMoney(scanner.nextInt());
        worker.out();
    }
}
