package org.example.day1y10.fanshi;

import java.util.HashMap;

/**
 * Student test
 * @author 86150
 * @date 2024/1/10 14:47
 */
public class Test2HashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("tom", new Student("汤姆", "男"));
        map.put("jerry", new Student("杰瑞", "女"));
        System.out.println(map.get("tom"));
        System.out.println(map.get("jerry"));
    }
}
