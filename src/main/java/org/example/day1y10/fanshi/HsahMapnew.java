package org.example.day1y10.fanshi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author 86150
 * @date 2024/1/11 9:33
 */
public class HsahMapnew {
    public static void main(String[] args) {
        HashMap map = new LinkedHashMap();
        map.put("apple", "苹果");
        map.put("banana", "香蕉");
        map.put("orange","橘子");
        System.out.println(map.get("apple"));
//        map.remove("apple");
        System.out.println(map.size());
        System.out.println(map.containsKey("banana"));

        //map输出方法
        Set keySet = map.keySet(); //从map对象中获取所有的键，并将它们存储在一个名为keySet的Set集合中

        for (Object key : keySet) {  //这是一个增强型for循环，它会遍历keySet中的每个元素。在每次迭代中，key变量都会被设置为当前的元素。
            Object value = map.get(key);   //使用当前的键从map中获取对应的值，并将其存储在value变量中。
            System.out.println(key + ":" + value);   //将当前的键和对应的值打印出来
        }
    }
}
