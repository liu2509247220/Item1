package org.example.day1229;

public class ProductArray {


    String[] productName = {"一", "二", "三", "四", "五", "六"};

    public boolean checkProducts(int startIndex, int endIndex, String name) {
        if (startIndex < endIndex) {
            for (int i = startIndex; i < endIndex; i++) {
                if (name.equals(productName[i])) {
                    return true;
                }
            }return false;
        } else {
            System.out.println("错误");
            return false;
        }
    }
}
