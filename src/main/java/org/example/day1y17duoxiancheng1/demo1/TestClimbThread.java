package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:46
 */
public class TestClimbThread {
    public static void main(String[] args) {
        ClimbThread c1 = new ClimbThread("老年人",600,15);
        ClimbThread c2 = new ClimbThread("年轻人",200,15);

        //开启线程
        c1.start();
        c2.start();

    }
}
