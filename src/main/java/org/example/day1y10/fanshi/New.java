package org.example.day1y10.fanshi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 86150
 * @date 2024/1/19 17:15
 */
public class New {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("cn", "中国");
        map.put("jp", "如不");

        System.out.println(map.get("cn"));

        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
