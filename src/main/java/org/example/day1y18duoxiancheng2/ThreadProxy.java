package org.example.day1y18duoxiancheng2;

/**
 * @author 86150
 * @date 2024/1/18 15:20
 */
//Proxy代理
public class ThreadProxy implements Runnable { //线程代理类，模拟一个极简Thread
    private Runnable target = null;  //属性，类型是Runnable



    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
    public ThreadProxy(Runnable target) {
        this.target = target;
    }


    public void start(){
        start0();  //真正实现多线程的方法
    }

    public void start0(){
        run();
    }

//    int count = 0;


//    @Override
//    public void run() {
//        while (true) {
//
//            System.out.println("小狗你叫" + (++count) + Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if (count == 10) {
//                break;
//            }
//        }
//    }
}
