package org.example.day1y8.yichang;

public class Test2 {
    public static void main(String[] args) {
        //try语句必须，catch和finally语句块均可选，但至少出现之一
        try {
            System.out.println("代码开始执行");
            int num = 10 / 0;
            System.out.println("代码执行到异常前");
        }catch (NullPointerException e){
            System.out.println("空指针异常");

        }
        catch (Exception e) {    //父 大异常要在后面   catch排列顺序，先子类后父类

            System.err.println("捕获到代码异常");
//            System.exit(1);    //退出虚拟机，以下都不执行
            return;           //执行finally之后再执行return
        } finally {

            System.out.println("代码依旧执行");
        }
    }
}
