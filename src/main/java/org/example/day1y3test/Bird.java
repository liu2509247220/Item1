package org.example.day1y3test;

public class Bird {
    private String name;
    private String pinzhong;
    private int health;

    public Bird() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinzhong() {
        return pinzhong;
    }

    public void setPinzhong(String pinzhong) {
        this.pinzhong = pinzhong;
    }

    public int getHealth() {
        if (health >= 90) {
            System.out.println(name + pinzhong + "非常健康");
        } else if (health >= 70) {
            System.out.println(name + pinzhong + "健康");
        } else if (health >= 60) {
            System.out.println(name + pinzhong + "健康状况一般");
        } else {
            System.out.println(name + pinzhong + "不健康");
        }
        return health;
    }

    public void setHealth(int health) {

        this.health = health;
    }
}
