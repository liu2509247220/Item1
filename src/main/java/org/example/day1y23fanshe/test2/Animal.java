package org.example.day1y23fanshe.test2;

/**
 * @author 86150
 * @date 2024/1/23 17:04
 */
public class Animal {
    private Double height;

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                '}';
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Animal(Double height) {
        this.height = height;
    }

    public Animal() {
    }
}
