package org.example.chongzai;

public class Test3 {
    public static void main(String[] args) {

        Score s1 = new Score();
        s1.name = "张三";
        s1.score = 60;

        Score s2 = new Score();
        s2.name = "甘于";
        s2.score = 58;

        Score[] students = {s1, s2};

//        Score score = new Score();
//        score.addScore(students);
        for(Score s:students){
            System.out.println(s.name+","+s.score);
        }
    }
}
