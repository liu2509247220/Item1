package org.example.day1y12test;

/**
 * @author 86150
 * @date 2024/1/12 9:48
 */
public class Test32 {
    public static void main(String[] args) {
        jijie(Test31.SPRING);
        jijie(Test31.SUMMER);
        jijie(Test31.AUTUMN);
        jijie(Test31.WINTER);
    }
    public static void jijie(Test31 test31){
        switch (test31){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }

}
