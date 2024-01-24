package org.example.day1y24.test2;

/**
 * @author 86150
 * @date 2024/1/24 10:11
 */
import java.io.IOException;
import java.nio.file.*;

public class Test2 {
    public static void main(String[] args) {

        Path sourcePath = Paths.get("D:/source.txt");
        Path targetPath = Paths.get("D:/target.txt");

        // 复制文件
        try {
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("文件复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 移动文件（重命名）
        Path moveTargetPath = Paths.get("D:/moved.txt");
        try {
            Files.move(targetPath, moveTargetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("文件移动成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 删除文件
        try {
            Files.delete(moveTargetPath);
            System.out.println("文件删除成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

