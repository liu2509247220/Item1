package org.example.day1y12test;

/**
 * @author 86150
 * @date 2024/1/12 10:07
 */
public class ID {
    private int id;

    public ID(int id) {
        this.id = id;
    }

    public ID() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID{" +
                "id=" + id +
                '}';
    }
}
