package org.example.day1y12test;

/**
 * @author 86150
 * @date 2024/1/12 10:08
 */
public class Student extends ID{
    private String name;
    private int score;

    public Student(int id) {
        super(id);
    }

    public Student() {
    }

    public Student(int id, String name, int score) {
        super(id);
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
