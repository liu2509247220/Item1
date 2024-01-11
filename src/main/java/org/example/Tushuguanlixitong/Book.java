package org.example.Tushuguanlixitong;

/**
 * 书籍类
 * @author 86150
 * @date 2024/1/10 16:32
 */
public class Book extends BaseEntity{
    private String bookName;    //书名
    private String author;    //作者
    private String publish;   //出版社

    public Book(String bookName, String author, String publish) {
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
    }

    public Book(int id, String bookName, String author, String publish) {
        super(id);
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                '}';
    }
}
