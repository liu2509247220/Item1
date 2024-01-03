package org.example.day1229;

import java.util.Scanner;

public class Flight {
    int flightNumber;
    String departure;//离开
    String destination;//目的地
    int passengers;//乘客
    public void addPassenger(String passengerName) {

        if (passengers < 200) {
            System.out.println("可以添加");
            System.out.println(passengerName);
        }else {
            System.out.println("拒绝添加");
        }



    }
}
