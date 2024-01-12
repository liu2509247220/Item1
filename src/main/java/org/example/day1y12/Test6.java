package org.example.day1y12;

/**
 * @author 86150
 * @date 2024/1/12 16:45
 */
public class Test6 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String str2 = "e";
        //搜索第一个出现的位置
        System.out.println(str.indexOf("b"));
        //最后的位置
        System.out.println(str.lastIndexOf("e"));

        //提取从2开始的字符串
        System.out.println(str.substring(2));

        //提取从1开始，5结束的字符串
        System.out.println(str.substring(1, 5));

        //返回一个前后不含任何空格的调用字符串
        System.out.println(str.trim());
    }
}
