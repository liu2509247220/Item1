package org.example.day1y2;

public class JiChengBird extends JiChengPet{
    private String type;//类型

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JiChengBird() {

    }

    @Override       //注解
    public void print() {

        super.print();
        System.out.println(this.getType());
    }
}
