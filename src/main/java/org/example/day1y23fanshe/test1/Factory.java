package org.example.day1y23fanshe.test1;

/**
 * @author 86150
 * @date 2024/1/23 14:00
 */
public class Factory {
//    public Goods getGoods(String str) {  //加字符串
//        //初始化
//        Goods goods = null;
//        if ("food".equals(str)) {  //判断传进来的字符串
//            return new Foods("食品类");  //返回一个食品对象
//        } else if ("TV".equals(str)){
//            return new TVs("电视机类");
//        }else {
//            return new Books("书籍");
//        }
//    }

    public Goods getGoods(String className) throws Exception {  //传字符串..大异常
        return (Goods) Class.forName(className).newInstance();  //传创建类的全路径

    }
}
