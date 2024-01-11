package org.example.day1y11.test4;

/**
 * 包装类 转换成基本数据类型
 *
 * @author 86150
 * @date 2024/1/11 15:58
 */
public class Test2 {
    public static void main(String[] args) {
        Integer i1 = new Integer(25);

        //转换成基本数据类型
        int i = i1.intValue();
        System.out.println(i1);

        Double d1 = new Double(10.2);
        Double d = d1.doubleValue();
        System.out.println(d);

        Character c1 = new Character('男');
        char c = c1.charValue();
        System.out.println(c);

        String sex = Character.toString('男');
        String s2 = Integer.toString(25);
        System.out.println(sex + s2);

    }
}
