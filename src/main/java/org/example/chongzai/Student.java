package org.example.chongzai;

public class Student {
    String[] names = {"张三","六六","七七","石达开"};
    public boolean searchName(int start, int end, String name) {
    //start是下标开始地址
        if (start < end) {
            for (int i = start; i < end; i++) {
                if (name.equals(names[i])){
                    //如果输入的name和names[i]中的一样则
                    return true;
                }
            }return false;
        } else {
            System.out.println("数字错误");
            return false;
        }
    }
}