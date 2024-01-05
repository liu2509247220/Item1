package org.example.day1y5jiekou2fangdaomen;

//子类防盗门
public class TheftproofDoor extends Door implements Lock{
    @Override
    public void lockUp() {
        System.out.println("关锁");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }
}
