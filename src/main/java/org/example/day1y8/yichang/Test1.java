package org.example.day1y8.yichang;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println("代码段1开始执行");
            int num = 10 / 0;
            System.out.println(num);
            System.out.println("代码段2开始执行");
        } catch (Exception e) {
            e.printStackTrace();   //打印堆栈的异常信息
            String message = e.getMessage();   //打印异常
            System.out.println(message);
            System.out.println("代码段出现异常");
        }
        System.err.println("后续代码执行");
    }
}
