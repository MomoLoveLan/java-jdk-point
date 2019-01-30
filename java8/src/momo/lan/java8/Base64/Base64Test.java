package momo.lan.java8.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @program: java-jdk-point
 * @description: 编码加解密
 * @author: zhanghui2018
 * @create: 2019-01-30 16:48
 */
public class Base64Test {
    public static void main(String[] args) {
        //加解密();
        //System.out.println(将文件File转换为Base64("F:\\1资料\\常见小知识\\git常用命令.txt"));
        将Base64转换为file文件(将文件File转换为Base64("F:\\1资料\\常见小知识\\git常用命令.txt"),"C:\\a.txt");
    }

    /**
     * 在Java8中Base64编码已经成为Java类库的标准，且内置了Base64编码的编码器和解码器
     */
    private static void 加解密() {
        String orig = "hello world!";
        //编码加密
        String desc = Base64.getEncoder().encodeToString(orig.getBytes(StandardCharsets.UTF_8));
        System.out.println("加密后的字符串为:"+desc);

        //解码解密
        String unDecodeStr=new String(Base64.getDecoder().decode(desc),StandardCharsets.UTF_8);
        System.out.println("解密后的字符串为"+unDecodeStr);
    }

    /**
     * fileToBase64
     */
    private static String 将文件File转换为Base64(String path) {
        File file = new File(path);
        FileInputStream inputFile;
        try {
            inputFile = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            inputFile.read(buffer);
            inputFile.close();
            return Base64.getEncoder().encodeToString(buffer);
        } catch (Exception e) {
            throw new RuntimeException("文件路径无效\n" + e.getMessage());
        }
    }

    /**
     * base64ToFile
     * @param base64
     * @param path
     * @return
     */
    public static boolean 将Base64转换为file文件(String base64, String path){
        byte[] buffer;
        try {
            buffer = Base64.getDecoder().decode(base64);
            FileOutputStream out = new FileOutputStream(path);
            out.write(buffer);
            out.close();
            return true;
        } catch (Exception e) {
            throw new RuntimeException("base64字符串异常或地址异常\n" + e.getMessage());
        }
    }


}
