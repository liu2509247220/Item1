package org.example.day1y16IO.zifuliu;

import java.io.*;

/**
 * @author 86150
 * @date 2024/1/16 17:20
 */
public class TestPet {
    public static void main(String[] args) {
        Reader reader = null;
        BufferedReader br = null;
        Writer writer = null;
        BufferedWriter bw = null;
        try {
            reader = new FileReader("D:/pet.txt");
            br = new BufferedReader(reader);
            writer = new FileWriter("D:/pet2.txt");
            bw = new BufferedWriter(writer);
            String line = null;
            StringBuffer sb = new StringBuffer();

            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                sb.append(line);
            }
            System.out.println(sb);
            String str = sb.toString();
            str = str.replace("{name}","{欧欧}");
            str = str.replace("{type}","{狗哦古}");
            str = str.replace("{master}","{牛牛}");
            bw.write(str);

            bw.flush();
            reader.close();
            br.close();
            writer.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
