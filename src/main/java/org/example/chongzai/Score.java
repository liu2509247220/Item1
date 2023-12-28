package org.example.chongzai;

public class Score {
    String name;
    int score;

    public void addScore(Score[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].score < 60) {
                students[i].score = students[i].score + 2;
            }
        }
    }
}
