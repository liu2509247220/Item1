package org.example.day1y11.test2;

/**
 * @author 86150
 * @date 2024/1/11 14:36
 */
public class WeekTest {
    public static void main(String[] args) {
    work(Week.Monday);
    work(Week.Tuesday);
    work(Week.Wednesday);
    work(Week.Thursday);
    work(Week.Friday);
    work(Week.Saturday);
    work(Week.Sunday);
    }
    public static void work(Week week) {
        switch (week) {
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("周五睡午觉");
                break;
            case Saturday:
                System.out.println("周六睡一天");
                break;
            case Sunday:
                System.out.println("睡死了");
                break;
        }
    }
}
