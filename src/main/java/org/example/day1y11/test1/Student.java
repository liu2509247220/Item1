package org.example.day1y11.test1;

/**
 * @author 86150
 * @date 2024/1/11 14:27
 */
public class Student {

    public Gender sex;

    public Gender getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sex=" + sex +
                '}';
    }
}
