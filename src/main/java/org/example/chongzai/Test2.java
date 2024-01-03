package org.example.chongzai;

public class Test2 {
    public static void main(String[] args) {

        Student student = new Student();
        boolean flag = student.searchName(2,3,"张三");
        //用flag判断true、false
        if (flag){
            System.out.println("查找成功");
        }else {
            System.out.println("查找失败");
        }
    }
}