package org.example.day1y12test;

import java.util.List;
import java.util.Scanner;

/**
 * @author 86150
 * @date 2024/1/12 10:12
 */
public class Test62 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            oStudent();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void oStudent() {
        do {
            System.out.println("1:查看学生;2:添加学生;3:删除学生");
            int num = Integer.parseInt(scanner.next());
            if (num == 1) {
                List<Student> studentList = Test61.getStudentList();
                for (Student student : studentList) {
                    System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getScore());
                }

            } else if (num == 2){
                System.out.println("请输入学生姓名");
                String studentName = scanner.next();
                System.out.println("输入分数");
                int studentScore = scanner.nextInt();
                Student student = new Student();
                student.setId(0);
                student.setName(studentName);
                student.setScore(studentScore);
                Test61.addStudent(student);
            }else {
                System.out.println("退出");
                break;
            }
        }while (true);
    }

}
