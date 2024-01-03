package org.example.day1229;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Patient patient = new Patient();

        patient.name = "小小怪";
        patient.age = 18;
        System.out.println(patient.name+patient.age);
        Scanner scanner = new Scanner(System.in);
        patient.bloodPressure = scanner.nextInt();
        patient.isHealthy();
    }
}
