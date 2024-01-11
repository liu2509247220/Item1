package org.example.Tushuguanlixitong;

import java.util.List;
import java.util.Scanner;

/**
 * @author 86150
 * @date 2024/1/10 16:49
 */
public class TestClient {
    static Scanner scanner = new Scanner(System.in);       //静态scanner,程序运行时就执行

    public static void main(String[] args) {

        System.out.println("欢迎来到书记管理系统，请登录");

        try {
            //封装登录的逻辑
            login();
            //封装书记操作的逻辑
            oprBook();
        } catch (Exception e) {
            //捕获异常并打印栈堆跟踪信息
            e.printStackTrace();
        } finally {
            //释放资源
            scanner.close();           //关闭scanner
        }
    }


    private static void login() {
        do {
            System.out.println("输入用户名");
            String username = scanner.next();
            System.out.println("输入密码");
            String password = scanner.next();
            for (int i = 0; i < DataUtil.getUserList().size(); i++) {
                //循环用户列表数组
                User user = DataUtil.getUserList().get(i);
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    System.out.println("登陆成功!");
                    //返回给login方法
                    return;
                }
            }
            System.out.println("用户名和密码不匹配，重新输入");
        } while (true);
    }


    //操作书籍逻辑
    private static void oprBook() {
        do {
            System.out.println("选择操作书籍的方式:1.查看所有书籍;2.添加书籍;3.退出登录");
            int num = Integer.parseInt(scanner.next());
            if (num == 1) {
                List<Book> bookList = DataUtil.getBookList();
                for (Book book : bookList) {
                    System.out.println(book.getId() + "\t\t" + book.getBookName() + "\t\t" + book.getAuthor() + "\t\t" + book.getPublish());

                }
            } else if (num == 2) {
                System.out.println("请输入书籍信息");
                System.out.print("请输入书名");
                String bookName = scanner.next();
                System.out.println("输入作者");
                String auther = scanner.next();
                System.out.println("输入出版社");
                String publish = scanner.next();
                Book book = new Book();
                book.setId(0);
                book.setBookName(bookName);
                book.setAuthor(auther);
                book.setPublish(publish);
                DataUtil.addBook(book);
            } else {
                System.out.println("退出");
                break;
            }
        } while (true);
    }
}
