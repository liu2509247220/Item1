package org.example.day1y12test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 86150
 * @date 2024/1/12 10:04
 */
public class Test61 {
    private static List<Student> studentList = null;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "张三", 60));
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void addStudent(Student student) {
        Student lastStudent = studentList.get(studentList.size());
        student.setId(lastStudent.getId() + 1);
        studentList.add(student);
    }
}
