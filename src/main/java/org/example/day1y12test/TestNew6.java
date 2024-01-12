package org.example.day1y12test;

import java.util.ArrayList;

/**
 * @author 86150
 * @date 2024/1/12 10:33
 */
public class TestNew6 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Student student1 = new Student(1,"张三",60);
        list.add(student1);  //添加
        list.remove(student1);  //删除
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if (o instanceof Student){
                Student student = (Student) o;
                System.out.println(student.getId()+student.getName()+student.getScore());
            }
        }
    }
}
