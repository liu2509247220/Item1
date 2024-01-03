package org.example.day1y2;

public class Bird {
    public String name;
    public String pinzhong;
    public int health;

    public void out() {
        if (health >= 90) {
            System.out.println(name + pinzhong + "非常健康");
        }else if (health>=70){
            System.out.println(name + pinzhong + "健康");
        }else if (health>=60){
            System.out.println(name + pinzhong + "健康状况一般");
        }else{
            System.out.println(name + pinzhong + "不健康");
        }
    }
}
