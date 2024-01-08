package org.example.day1y8.yichang;

public class Test5 {
    public static void main(String[] args) throws MyException {
        test();
    }
    public static void test() throws MyException {
        throw new MyException("我自定义的异常");   //抛出异常类
    }
}
