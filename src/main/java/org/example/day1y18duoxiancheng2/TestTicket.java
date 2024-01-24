package org.example.day1y18duoxiancheng2;

/**
 * @author 86150
 * @date 2024/1/18 13:47
 */
public class TestTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t, "抢票代理");
        Thread t2 = new Thread(t, "套跑跑");
        Thread t3 = new Thread(t, "黄牛");

        t1.start();
        t2.start();
        t3.start();
    }
}
