package org.example.day1y19.test;

import java.io.*;

/**
 * @author 86150
 * @date 2024/1/19 9:56
 */
public class Test2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader("D:/test1.txt");
            br = new BufferedReader(reader);
            writer = new FileWriter("D:/test2.txt");
            bw = new BufferedWriter(writer);
            byte[] bytes = new byte[4];
            int len = 0;
            StringBuffer sb = new StringBuffer();

            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sb.append(line);
            }

            String string = sb.toString();
            sb.append(string);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
