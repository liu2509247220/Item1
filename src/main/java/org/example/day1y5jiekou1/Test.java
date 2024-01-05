package org.example.day1y5jiekou1;

public class Test {
    public static void main(String[] args) {
        //usb的类型是usb接口类型，传输的对象是UsbFan
        Usb usb = new UsbFan();
        //调用work结果为吹风
        usb.work();
        usb = new UsbMouse();
        usb.work();
        usb = new UsbDisk();
        usb.work();

    }
}
