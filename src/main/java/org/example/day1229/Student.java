package org.example.day1229;

public class Student {

    String name;
    int score;

    public void displayStatus(){
        if (score>=60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }

}



