package org.example.day1y3duotai;

public class Boy {
    public void listen(Girl girl){
        girl.sayLove();
    }
    public Girl getType(int type){
        Girl girl = null;
        if (type==1){
            girl = new ChineseGirl();
        }else if (type ==2){
            girl = new EnglishGirl();
        }
        return girl;
    }


}
