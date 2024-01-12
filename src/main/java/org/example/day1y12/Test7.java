package org.example.day1y12;

/**
 * @author 86150
 * @date 2024/1/12 16:53
 */
public class Test7 {
    public static void main(String[] args) {
        String filename = "HelloWorld.java";
        if (filename.indexOf(".java") > 0) {
            System.out.println("文件名合法");
        } else {
            System.out.println("文件名不合法");
        }

        String email = "asdkhasd@qq.com";
        if (email.indexOf("@") > 0 && email.indexOf(".") > 0 && email.indexOf("@") < email.indexOf(".")){
            System.out.println("邮箱格式正确");
        }else {
            System.out.println("邮箱格式不正确");
        }
    }
}
