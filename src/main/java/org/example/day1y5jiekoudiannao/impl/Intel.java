package org.example.day1y5jiekoudiannao.impl;

import org.example.day1y5jiekoudiannao.CPU;

public class Intel implements CPU {
    @Override
    public String pinPai() {
        return "intel";
    }

    @Override
    public double zhuPin() {
        return 3.8;
    }
}
