package org.example.day1y3test;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String hobby;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public Person() {
    }
    public void out(){
        System.out.println("姓名"+name+"年龄"+age+"性别"+gender+"爱好"+hobby);

    }
}
