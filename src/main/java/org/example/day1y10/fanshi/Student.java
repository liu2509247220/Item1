package org.example.day1y10.fanshi;

/**
 * @author 86150
 * @date 2024/1/10 14:46
 */
public class Student {
    private String name;
    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Student() {
    }
}
