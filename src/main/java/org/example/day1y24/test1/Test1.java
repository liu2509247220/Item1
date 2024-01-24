package org.example.day1y24.test1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 86150
 * @date 2024/1/24 9:54
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(3);


        Collections.sort(list);
        System.out.println("排序后" + list);

        Collections.reverse(list);
        System.out.println("反转后" + list);

        int target = 5;
        int index = Collections.binarySearch(list,target);
        if (index >= 0) {
            System.out.println("找到" + target + ",索引" + index);
        } else {
            System.out.println("没找到" + target);
        }
    }
}
