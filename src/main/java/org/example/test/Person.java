package org.example.test;

/**
 * @author 86150
 * @date 2024/1/9 16:13
 */
public class Person {
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        if (this.age < 0) {
            return 0;
        } else if (this.age >= 200) {
            return 200;
        } else {
            return this.age;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public void print() {
        System.out.println(this.getAge());
    }

}
