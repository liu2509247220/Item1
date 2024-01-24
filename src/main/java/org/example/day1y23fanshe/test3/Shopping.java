package org.example.day1y23fanshe.test3;

import java.lang.reflect.Method;

/**
 * @author 86150
 * @date 2024/1/24 9:40
 */
public class Shopping {
    public Double testDiscount(String className) throws Exception{
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("discount");
        return (Double) method.invoke(o);
    }

}
