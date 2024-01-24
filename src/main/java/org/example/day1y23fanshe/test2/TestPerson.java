package org.example.day1y23fanshe.test2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 86150
 * @date 2024/1/23 17:05
 */
public class TestPerson {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("org.example.day1y23fanshe.test2.Person");
        Field[] fields = aClass.getFields();  //自己定字段输出
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=============");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {  //自己的所有字段
            System.out.println(declaredField);
        }
        System.out.println("=============");
        Field name = aClass.getField("name");  //返回特定公共字段，私有的属性无法
        System.out.println(name);

        Method[] methods = aClass.getMethods();  //所以公共方法
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
