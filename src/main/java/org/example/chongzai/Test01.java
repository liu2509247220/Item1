package org.example.chongzai;

public class Test01 {
    public static void main(String[] args) {
        printGrade(88.5);
    }
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else {
            System.out.println('e');
        }
    }
}
