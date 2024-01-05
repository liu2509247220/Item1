package org.example.day1y5jiekou2fangdaomen;

public class Test {
    public static void main(String[] args) {
        //向上
        Door door = new TheftproofDoor();
        //判断门是不是锁的实例，如果是则进行强制类型转换
        if(door instanceof Lock){
            Lock lock = (Lock) door;
            lock.openLock();//开锁
        }
        //开门的过程
        door.open();

        //关门的过程
        door.close();
        if (door instanceof Lock){
            Lock lock = (Lock) door;
            lock.lockUp();//关锁
        }
    }
}
