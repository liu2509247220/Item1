package org.example.day1229;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

    Flight flight = new Flight();
    flight.flightNumber = 2;
    flight.departure = "南京";
    flight.destination = "北京";
    System.out.println("航班为"+flight.flightNumber+"从"+flight.departure+"飞往"+flight.destination);
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入乘客数");
    flight.passengers = scanner.nextInt();
    flight.addPassenger("大大怪");



    }
}
