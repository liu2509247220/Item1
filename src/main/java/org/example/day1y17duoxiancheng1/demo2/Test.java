package org.example.day1y17duoxiancheng1.demo2;

/**
 * @author 86150
 * @date 2024/1/17 15:09
 */
public class Test {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("普通号", 500, 20);
        Hospital2 h2 = new Hospital2("特需号", 1000, 10);

        h1.setPriority(10);
        h2.setPriority(1);

        h1.start();
        h2.start();
//        if (h1.getNum() == 9) {
//            try {
//                h2.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
