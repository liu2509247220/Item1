package org.example.Class;

public class Person {
    String name;
    int age;
    String gender;
    String hobby;
    int home;
    public void show() {
        switch (home) {
            case 1:
                System.out.println("姓名" + name + "，年龄" + age + "，性别" + gender + ",爱好" + hobby + ",籍贯江苏省");
                break;
            case 2:
                System.out.println("姓名" + name + "，年龄" + age + "，性别" + gender + ",爱好" + hobby + ",籍贯浙江省");
                break;
            case 3:
                System.out.println("姓名" + name + "，年龄" + age + "，性别" + gender + ",爱好" + hobby + ",籍贯上海市");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }
}
