package org.example.day1y3duotai;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object obj) {
        //判断obj是否为空
        if (null == obj){
            return false;
        }else {
            //判断obj是否是student的实例
            if (obj instanceof Student){
                //强制类型转换
                Student student = (Student) obj;
                //根据id和name判断
                if (student.getId()==this.getId()&&student.getName().equals(this.getName())){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    //toString()方法返回String类型，描述当前对象的有关信息
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
