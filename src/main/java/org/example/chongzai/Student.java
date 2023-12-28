package org.example.chongzai;

public class Student {
    String[] names = {"张三","六六","七七","石达开"};
    public boolean searchName(int start, int end, String name) {
        if (start < end) {
            for (int i = start; i < end; i++) {
                if (name.equals(names[i])){
                    return true;
                }
            }return false;
        } else {
            System.out.println("数字错误");
            return false;
        }
    }
}