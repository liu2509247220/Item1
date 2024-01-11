package org.example.kuangjiahefanxing1;

import java.util.LinkedList;

/**
 * @author 86150
 * @date 2024/1/9 14:13
 */
public class Test2 {
    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        News news1 = new News(1, "王", "10");
        News news2 = new News(2, "王", "10");
        News news3 = new News(3, "王", "10");
        newList.add(news1);
        newList.add(news2);
        newList.add(news3);
//        System.out.println(newList);

        newList.addFirst(new News(4,"是的","20"));
        newList.addLast(new News(5,"是的","20"));

        Object delete = newList.removeFirst();   //删除并显示First
        System.out.println(delete);

        for (Object obj : newList) {
            if(obj instanceof News){
                News news = (News) obj;
                System.out.println(news.getId() + "," + news.getTitle() + "," + news.getCreatTime());
            }
        }

    }
}
