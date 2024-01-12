package org.example.day1y12test;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 86150
 * @date 2024/1/12 9:40
 */
public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        Set<String> keySet = map.keySet();
        for (Object key : keySet) {
            Object value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
