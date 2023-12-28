package org.example.Class;

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    String gender;
    String work;
    int money;

    public void upup() {
//        String[] workclass = {"developer", "manager", "cto"};
        if ("developer".equals(work)) {
            money += 2000;
        } else if ("manager".equals(work)) {
            money += 5000;
        } else if ("cto".equals(work)) {
            money += 10000;
        } else {
            System.out.println("输入错误");
        }
    }

}
