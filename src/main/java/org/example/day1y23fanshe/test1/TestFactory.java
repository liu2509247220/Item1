package org.example.day1y23fanshe.test1;

/**
 * @author 86150
 * @date 2024/1/23 14:03
 */
public class TestFactory {
    public static void main(String[] args) throws Exception{

        Factory factory = new Factory();
//        Goods goods = factory.getGoods("food");
//        System.out.println(goods.getName());
//        Goods tv = factory.getGoods("TV");
//        System.out.println(tv.getName());
//        goods = factory.getGoods("book");
//        System.out.println(goods);
        Goods goods = factory.getGoods("org.example.day1y23fanshe.test1.Books");//Books的全路径
        System.out.println(goods.getName());   //直接使用会实例化异常，因为使用反射调用默认构造，
        Goods foods = factory.getGoods("org.example.day1y23fanshe.test1.Foods");
        System.out.println(foods);
    }
}
