package org.example.day1y12test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 86150
 * @date 2024/1/12 9:54
 */
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        //排序前查找5的位置
        System.out.println(Collections.binarySearch(list, 5));
        Collections.sort(list);
        //排序输出
        System.out.println(list);


    }
}
