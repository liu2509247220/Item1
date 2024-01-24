package org.example.day1y19.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 86150
 * @date 2024/1/19 9:56
 */
public class Test1 {
    public  static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        String format = simpleDateFormat.format(date);

        System.out.println(format);

    }
}
