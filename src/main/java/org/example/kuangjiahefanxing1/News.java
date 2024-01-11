package org.example.kuangjiahefanxing1;

/**
 * @author 86150
 * @date 2024/1/9 13:55
 */
public class News {
    private int id;
    private String title;
    private String creatTime;

    public News() {
    }

    public News(int id, String title, String creatTime) {
        this.id = id;
        this.title = title;
        this.creatTime = creatTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;

    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", creatTime='" + creatTime + '\'' +
                '}';
    }
}

