package org.example.day1y10.fanshi;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 86150
 * @date 2024/1/10 15:16
 */
public class Test5Collections {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //向里面加
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(15);
        Collections.sort(nums);

        //forEach遍历
        nums.forEach(System.out::println);
        //查找在第几个位置
        System.out.println(Collections.binarySearch(nums, 5));

        //里面的最大值
        Integer max = Collections.max(nums);
        System.out.println("最大值为" + max);

        //反转输出
        Collections.reverse(nums);
        nums.forEach(System.out::println);



    }
}
