package org.example.day1y17duoxiancheng1.demo2;

/**
 * @author 86150
 * @date 2024/1/17 15:30
 */
public class Hospital2 extends Thread {
    private int time;
    private int num;

    public Hospital2() {
    }

    public Hospital2(String name,int time, int num) {
        super(name);
        this.time = time;
        this.num = num;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println(Thread.currentThread().getName() + (i + 1) + "号病人正在看病！");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
