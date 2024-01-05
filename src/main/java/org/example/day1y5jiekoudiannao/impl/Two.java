package org.example.day1y5jiekoudiannao.impl;

import org.example.day1y5jiekoudiannao.EMS;

public class Two implements EMS {
    @Override
    public String kind() {
        return "2G内存";
    }

    @Override
    public int emsSize() {
        return 1024;
    }
}
