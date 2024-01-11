package org.example.day1y10.fanshi;

/**
 * @author 86150
 * @date 2024/1/10 16:01
 */
public class User implements Comparable<User> {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public User() {
    }

    private int id;

    @Override
    public int compareTo(User o) {
        if (this.hashCode() < o.hashCode()) {
            return 1;
        } else {
            return -1;
        }
    }
}
