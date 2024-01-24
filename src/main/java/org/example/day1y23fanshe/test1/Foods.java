package org.example.day1y23fanshe.test1;

/**
 * @author 86150
 * @date 2024/1/23 13:59
 */
public class Foods extends Goods{
    public Foods() {
        this("食品类");
    }

    //继承食品类，生成带参构造
    public Foods(String name) {
        super(name);
    }
}
