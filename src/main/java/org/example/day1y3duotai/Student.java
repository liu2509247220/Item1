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
    //这段代码是一个Java方法，用于判断两个对象是否相等。具体来说，它重写了equals()方法，
    // 用于比较当前对象（this）和传入的对象（obj）是否相等。
    //
    //首先，代码会检查传入的对象（obj）是否为空，如果为空，则直接返回false，表示不相等。
    //
    //接下来，代码会判断传入的对象（obj）是否是Student类的实例。如果是，则将传入的对象强制转换为Student类型，
    // 并将其赋值给变量student。
    //
    //然后，代码会比较student对象的id和当前对象的id是否相等，以及student对象的name和当前对象的name是否相等。
    // 如果这两个条件都满足，则返回true，表示相等；否则，返回false，表示不相等。
    //
    //最后，如果传入的对象（obj）不是Student类的实例，或者在前面的条件判断中已经返回了结果，则直接返回true，表示相等。
    //
    //需要注意的是，这个方法的返回值是布尔类型（boolean），表示两个对象是否相等。

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
