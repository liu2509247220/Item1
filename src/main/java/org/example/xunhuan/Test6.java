package org.example.xunhuan;

public class Test6 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(" ");
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//        }


        for (int i = 1; i <= 5; i++) {//利用for循环 内部代码是每一层
            int m = 2 * i - 1;//定义每一个层数应该画出的星星数量
            for (int j = 1; j <= 2 * 5 - 1; j++) {//定义每层中星星前面空格的数量
                if (i + j <= 5) {//利用if判断 空格数量加上层数是否小于等于5  画坐标图可看出
                    System.out.print(" ");//打印空格
                } else {
                    System.out.print("*");//打印星星
                    m--;//每打印一颗星星 m自减
                    if (m == 0) {//当m=0时  不再需要画星星  break跳出for循环
                        break;
                    }
                }
            }
            System.out.println();//每一层结束	换行
        }
    }
}
