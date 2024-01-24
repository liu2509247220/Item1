package org.example.day1y18duoxiancheng2;

/**
 * @author 86150
 * @date 2024/1/18 11:14
 */
public class TestPointer {
    public static void main(String[] args) {
        Pointer pointer = new Pointer("特需号");
        //设置线程优先级
        pointer.setPriority(10);
        pointer.start();
        Thread.currentThread().setName("普通号");
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + i + "号病人在看病");
            if (i==10){
                try {
                    pointer.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
