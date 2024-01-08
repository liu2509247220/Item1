package org.example.day1y8.yichang;

public class Test4 {
    public static void main(String[] args) throws Exception {  //加throws抛出异常给虚拟机
        test();
    }

    public static void test() throws Exception{    //加static使main方法调用test
        throw new Exception("自己声明的大异常");
    }
}
