package org.example.day1y8.test1;

public class Student implements Person {
    String name;
    String sex;
    int birthday;
    private int sID = 01;
    private String speciality = "学生";

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Student(int sID, String speciality) {
        this.sID = sID;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sID=" + sID +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override


    public void setData(String name, String sex, int birthday) {

        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    @Override
    public String getData() {

        return "姓名" + name + "性别" + sex + "生日" + birthday + "id" + sID + "专长" + speciality;
    }

    public Student() {
    }
}
