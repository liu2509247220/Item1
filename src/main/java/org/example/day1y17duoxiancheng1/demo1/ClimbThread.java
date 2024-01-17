package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:44
 */
public class ClimbThread extends Thread {
    private int time;
    private int num;

    public ClimbThread(String name,int time, int num) {
        super(name);
        this.time = time;
        this.num = num;
    }


    @Override
    public void run() {
        for (int i = 1; i < num; i++) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "爬完" + 100 + "米");
        }
        System.out.println(Thread.currentThread().getName() + "到达终点");
    }
}
