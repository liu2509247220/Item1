package org.example.day1y5jiekoudiannao.impl;

import org.example.day1y5jiekoudiannao.HardDisk;

public class SSD implements HardDisk {
    @Override
    public int diskSize() {
        return 1000;
    }
}
