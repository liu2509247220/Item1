package org.example.kuangjiahefanxing1;

import java.util.ArrayList;

/**
 * @author 86150
 * @date 2024/1/9 13:57
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList newlist = new ArrayList();
        News news1 = new News(1, "地球爆炸", "10");
        News news2 = new News(2, "地球重生", "10");
        News news3 = new News(3, "地球缩小", "10");

        newlist.add(news1);
        newlist.add(news2);
        newlist.add(news3);
//        System.out.println(newlist);

        int size = newlist.size();
        System.out.println(size);

        newlist.remove(2);   //移除

        for (int i = 0; i < newlist.size(); i++) {
            Object o = newlist.get(i);
            if(o instanceof News){
                News news = (News) o;
                System.out.println(news.getId() + "," + news.getTitle() + "," + news.getCreatTime());

            }
        }
//        for (Object obj : newlist) {
//            if (obj instanceof News) {
//                News news = (News) obj;
//                System.out.println(news.getId() + "," + news.getTitle() + "," + news.getCreatTime());
//            }
//        }
    }
}
