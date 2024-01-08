package org.example.day1y8.yichang;

public class Test6 {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常" + e);
        }
        System.out.println("后续代码");
    }
}
