package org.example.day1y11.test1;

/**
 * @author 86150
 * @date 2024/1/11 14:27
 */
public class meiju {
    public static void main(String[] args) {
        Student student = new Student();
        student.sex = Gender.MAN;
        student.sex = Gender.WOMAN;
        System.out.println(student.sex);
    }
}
