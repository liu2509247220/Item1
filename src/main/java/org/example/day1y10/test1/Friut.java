package org.example.day1y10.test1;

import java.util.ArrayList;

/**
 * @author 86150
 * @date 2024/1/10 9:23
 */
public class Friut {
    private int id;

    public Friut(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Friut(int id) {
        this.id = id;
    }

    private String name;

    public Friut() {
    }

    public Friut(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friut{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList newlist = new ArrayList();
        Friut friut1 = new Friut(1, "apple");
        Friut friut2 = new Friut(2, "banana");
        Friut friut3 = new Friut(3, "cherry");

        newlist.add(friut1);
        newlist.add(friut2);
        newlist.add(friut3);

        newlist.add(new Friut(4, "orange"));
        for (int i = 0; i < newlist.size(); i++) {
            Object obj = newlist.get(i);
            if(obj instanceof Friut){
                Friut friut = (Friut) obj;
                System.out.println(friut.getName());

            }
        }
//        newlist.forEach(System.out::println);
    }
}
