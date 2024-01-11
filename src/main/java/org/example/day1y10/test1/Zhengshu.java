package org.example.day1y10.test1;

import java.util.ArrayList;

/**
 * @author 86150
 * @date 2024/1/10 9:38
 */
public class Zhengshu {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zhengshu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Zhengshu(String name) {
        this.name = name;
    }

    public Zhengshu(int id) {
        this.id = id;
    }

    public Zhengshu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Zhengshu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList newList = new ArrayList();
        Zhengshu shu = new Zhengshu();
        newList.add(new Zhengshu(1));
        newList.add(new Zhengshu(2));
        newList.add(new Zhengshu(3));
        newList.add(new Zhengshu(4));
        newList.add(new Zhengshu(5));

        newList.add(new Zhengshu("hello"));

        for (Object o : newList) {
            if (o instanceof Zhengshu) {
                Zhengshu zhengshu = (Zhengshu) o;
                System.out.println(zhengshu.getId() + zhengshu.getName());
            }
        }
    }
}
