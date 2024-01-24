package org.example.day1y23fanshe.test1;

/**
 * 父类 商品类
 * @author 86150
 * @date 2024/1/23 13:58
 */
public class Goods {
    private  String name;

    public Goods() {
    }

    public Goods(String name) {
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
        return "Goods{" +
                "name='" + name + '\'' +
                '}';
    }
}
