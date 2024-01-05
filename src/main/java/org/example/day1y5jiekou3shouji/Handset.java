package org.example.day1y5jiekou3shouji;

//父类
public class Handset {
    private String brand;//手机品牌
    private String type;//手机型号

    public Handset() {
    }

    public Handset(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Handset{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void sendInfo() { //发送短信
        System.out.println("发送短信息");
    }

    public void call() {
        System.out.println("打电话");
    }

    public void info() {
        System.out.println("手机品牌" + this.getBrand() + ",手机型号" + getType());
    }

}
