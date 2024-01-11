package org.example.day1y10.fanshi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 86150
 * @date 2024/1/10 13:44
 */
public class Test {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        //key+value
        map.put("CN", "中国");
        map.put("JP", "霓虹");
        map.put("US", "美国");
//        System.out.println(map.get("CN"));
        //移除
//        map.remove("JP");
//        map.remove("US");


        //返回key的集合 键
        Set keySet = map.keySet();
        //获取迭代器
//        Iterator it = keySet.iterator();
        Iterator it = keySet.iterator();
        //判断下面有没有key
        while (it.hasNext()) {
            //拿到每一次循环的key
            Object key = it.next();
            //通过map的get方法，将key建传入，获取对应的值
            Object value = map.get(key);
            System.out.println(key + "," + value);
        }

        System.out.println(map.size());

        //看键是否存在
        System.out.println(map.containsKey("CN"));
        //看值是否存在
        System.out.println(map.containsValue("中国"));

        for (Object key : keySet) {
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
