package org.example.day1y11.test4;

/**
 * @author 86150
 * @date 2024/1/11 15:23
 */
public class Test1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);   //1
        Integer i2 = new Integer("10");   //字符串10
        System.out.println(i1 + "," + i2);
        System.out.println(i1 + i2);         //11

        Double d1 = new Double(10.2);
        Double d2 = new Double("10.2");   //字符串
        System.out.println(d1 + "," + d2);
        System.out.println(d1 + d2);

        Long l1 = new Long(100);
        Long l2 = new Long("10");          //字符串
        System.out.println(l1 + "," + l2);
        System.out.println(l1 + l2);


        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean("true");
        Boolean b4 = new Boolean("false");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);



    }
}
