package org.example.day1y12;

/**
 * @author 86150
 * @date 2024/1/12 15:17
 */
public class Test3 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String upperCase = s1.toUpperCase();
        System.out.println(upperCase); //转为大写
        String lowerCase = s2.toLowerCase();
        System.out.println(lowerCase);//转为小写
    }
}
