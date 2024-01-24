package org.example.day1y24.test4;

import java.lang.reflect.Field;

/**
 * @author 86150
 * @date 2024/1/24 10:35
 */
public class Test4 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("org.example.day1y24.test4.Animal");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
