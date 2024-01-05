package org.example.day1y5jiekoudiannao.impl;

import org.example.day1y5jiekoudiannao.EMS;

public class Eight implements EMS {
    @Override
    public String kind() {
        return "8G内存";
    }

    @Override
    public int emsSize() {
        return 2048;
    }
}
