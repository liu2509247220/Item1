package org.example.day1229;

public class Patient {
    String name;
    int age;
    int bloodPressure;
    public void isHealthy(){
        if (bloodPressure<17.3){
            System.out.println("正常血压");
        }else {
            System.out.println("高血压");
        }
    }
}
