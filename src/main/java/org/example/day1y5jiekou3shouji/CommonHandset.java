package org.example.day1y5jiekou3shouji;

//普通手机类
public class CommonHandset extends Handset implements PlayWiring {

    public CommonHandset() {
    }

    public CommonHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void play(String content) {
        System.out.println("播放" + content);
    }
}
