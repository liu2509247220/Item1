package org.example.day1y5jiekou3shouji;

//智能手机类
public class AptitudeHandset extends Handset implements NetWork, PlayWiring, TheakePictures {
    @Override
    public void netWorkConn() {
        System.out.println("上网");
    }

    @Override
    public void play(String content) {
        System.out.println("播放" + content);
    }

    @Override
    public void takePictures() {
        System.out.println("拍照录像");
    }
}
