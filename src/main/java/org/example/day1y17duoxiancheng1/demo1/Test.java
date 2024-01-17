package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:57
 */
public class Test {
    public static void main(String[] args) {
        //显示默认优先级
        System.out.println("*****显示默认优先级*****");
        System.out.println("主线程名" + Thread.currentThread().getName() + "，优先级，" + Thread.currentThread().getPriority());
        Thread thread = new Thread();
        System.out.println("子线程名" + thread.getName() + "，优先级，" + thread.getPriority());
        System.out.println("*****修改默认优先级*****");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("主线程名" + Thread.currentThread().getName() + "，优先级，" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("子线程名" + thread.getName() + "，优先级，" + thread.getPriority());


    }
}
