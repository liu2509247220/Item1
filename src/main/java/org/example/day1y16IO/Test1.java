package org.example.day1y16IO;

import java.io.File;

/**
 * @author 86150
 * @date 2024/1/16 9:19
 */
public class Test1 {
    public static void main(String[] args) {
        File file = new File("D:/1234.txt");
//    try{
//        System.out.println(file.createNewFile());
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
        if (file.exists()) {
            boolean rename = file.renameTo(new File("D:/4321.txt"));
            System.out.println(rename);
        }
        String name = file.getName();
        System.out.println("名称:" + name);
        String filePath = file.getPath();
        System.out.println("相对路径:" + filePath);
        String absolutePath = file.getAbsolutePath();
        System.out.println("绝对路径:" + absolutePath);
        long length = file.length();
        System.out.println("文件大小:" + length + "字节");
    }
}
