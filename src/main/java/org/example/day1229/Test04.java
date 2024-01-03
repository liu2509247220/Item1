package org.example.day1229;

public class Test04 {
    public static void main(String[] args) {
        ProductArray productArray = new ProductArray();
        boolean flag = productArray.checkProducts(1,5,"二");

        if (flag){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }
}
