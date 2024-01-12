package org.example.day1y12;

/**
 * @author 86150
 * @date 2024/1/12 15:19
 */
public class Test4 {
    public static void main(String[] args) {

        String s1 = "张三";
        String s2 = "张三";
        String s3 = "张三";
        System.out.println(s1 + s2 + s3);
        System.out.println(s1.concat(s2).concat(s3));
    }
}
