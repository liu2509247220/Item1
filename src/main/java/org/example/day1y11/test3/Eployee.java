package org.example.day1y11.test3;

/**
 * @author 86150
 * @date 2024/1/11 14:42
 */
public class Eployee {
    public static void main(String[] args) {
        test(Level.L1);
        test(Level.L2);
        test(Level.L3);
    }
    public static void test(Level level){
        switch (level){
            case L1:
                System.out.println("Java");
                break;
            case L2:
                System.out.println("python");
                break;
            case L3:
                System.out.println("66");
                break;
        }
    }

}
