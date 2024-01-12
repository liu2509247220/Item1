package org.example.day1y12test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 86150
 * @date 2024/1/12 9:34
 */
public class Test1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
