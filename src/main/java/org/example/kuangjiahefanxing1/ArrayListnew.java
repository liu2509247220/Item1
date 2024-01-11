package org.example.kuangjiahefanxing1;

import java.util.ArrayList;

/**
 * @author 86150
 * @date 2024/1/11 10:26
 */
public class ArrayListnew {
    public static void main(String[] args) {
        ArrayList newlist = new ArrayList();
        News news1 = new News(1, "6", "2024");
        News news2 = new News(2,"是的","2003");

        newlist.add(news1);
        newlist.add(news2);
        System.out.println(newlist.size());
//        Object o = newlist.get(2);
        System.out.println(newlist.contains(news1));

        newlist.remove(news1);

        System.out.println(newlist.contains(news1));

        for (int i = 0; i < newlist.size(); i++) {
            Object o = newlist.get(i);
            if (o instanceof News){
                News news = (News) o;
                System.out.println(news.getId()+news.getCreatTime()+news.getTitle());
            }
        }


    }
}
