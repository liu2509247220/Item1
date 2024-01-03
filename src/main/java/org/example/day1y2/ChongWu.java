package org.example.day1y2;

public class ChongWu {
    private String name;
    private int kinds;
    private String gender;
    private int health;

    public void setName(String name) {
        this.name = name;
    }

    public void setKinds(int kinds) {
        switch (kinds) {
            case 1:
                kinds = Integer.parseInt("狗");
                break;
            case 2:
                kinds = Integer.parseInt("企鹅");
                break;
            default:
                kinds = Integer.parseInt("没有");
        }
        this.kinds = kinds;
    }

    public void setGender(String gender) {


        this.gender = gender;
    }

    public void setHealth(int health) {
        if (health > 100 || health < 0) {
            health = 60;
        } else {
            this.health = health;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getKinds() {
        return this.kinds;
    }

    public String getGender() {
        return this.gender;
    }

    public int getHealth() {
        return this.health;
    }

}
