package org.example.day1y3duotai;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy();

//        ChineseGirl chineseGirl = new ChineseGirl();
//
//        boy.listen(chineseGirl);
//
//        EnglishGirl englishGirl = new EnglishGirl();
//
//        boy.listen(englishGirl);
        //代码定义了四个类：Girl、EnglishGirl、ChineseGirl 和 Boy。其中，Girl 类有一个 sayLove() 方法，
        // EnglishGirl 和 ChineseGirl 类分别继承了 Girl 类并重写了 sayLove() 方法。Boy 类有一个 lieten() 方法，
        // 该方法接受一个 Girl 类型的参数，并调用其 sayLove() 方法。
        //
        //在 Test 类的 main() 方法中，创建了一个 Boy 对象和一个 ChineseGirl 对象，
        // 然后调用 boy.lieten(chineseGirl) 方法，输出 "我爱你"。
        // 接着创建了一个 EnglishGirl 对象，再次调用 boy.lieten(englishGirl) 方法，输出 "i love u"。


        //用父类作为返回值
        Girl type = boy.getType(1);
        System.out.println(type);
        System.out.println(boy.getType(2));
        System.out.println(boy.getType(3));
    }
}
