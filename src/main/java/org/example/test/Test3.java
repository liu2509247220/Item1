package org.example.test;

import java.util.Scanner;

/**
 * @author 86150
 * @date 2024/1/9 16:13
 */
public class Test3 {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        person.setAge(scanner.nextInt());
        person.print();

    }

}
