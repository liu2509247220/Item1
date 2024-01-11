package org.example.Tushuguanlixitong;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 86150
 * @date 2024/1/10 16:35
 */
public class DataUtil {


        //定义两个成员变量,在内存中只有一份
    private static List<User> userList = null;
    private static List<Book> bookList = null;

    //静态代码块，在类加载时执行，只执行一次
    static {
        userList = new ArrayList<>();
        userList.add(new User(1, "admin", "123"));
        userList.add(new User(2, "Admin", "123"));

        bookList = new ArrayList<>();
        bookList.add(new Book(1, "鸡汤来喽", "老冯", "牛马"));
        bookList.add(new Book(2, "真的是你鸭", "你干嘛", "哎呦"));
        bookList.add(new Book(3, "我不吃牛肉", "正宗狗军阀", "出生里的出生"));
        bookList.add(new Book(4, "我不是人啊", "大声发", "要喝就喝这个嘛"));
    }

    //获取用户信息
    public static List<User> getUserList() {
        return userList;
    }

    //获取书的信息
    public static List<Book> getBookList() {
        return bookList;
    }

    public static void addBook(Book book) {
        //插入书籍
        Book lastBook = bookList.get(bookList.size() - 1);  //最后一个光标位置
        book.setId(lastBook.getId() + 1);    //id加1
        bookList.add(book);    //List.add
    }
}
