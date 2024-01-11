package org.example.kuangjiahefanxing1;

import java.util.LinkedList;

/**
 * @author 86150
 * @date 2024/1/11 11:33
 */
public class LinkedListnew {
    public static void main(String[] args) {
        LinkedList newlist = new LinkedList();
        News news1 = new News(1, "圣诞节", "十大科技");
        News news2 = new News(2, "王八蛋", "666");
        News news3 = new News(3, "王八蛋", "666");

        newlist.add(news1);
        newlist.addFirst(news2);
        newlist.addLast(news3);

        System.out.println(newlist.getFirst());
        System.out.println(newlist.removeLast());

        for (Object obj : newlist) {
            if (obj instanceof News) {
                News news = (News) obj;
                System.out.println(news.getId() + "," + news.getTitle() + "," + news.getCreatTime());
            }
        }

    }
}
