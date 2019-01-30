package momo.lan.java8.Base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @program: java-jdk-point
 * @description: 编码加解密
 * @author: zhanghui2018
 * @create: 2019-01-30 16:48
 */
public class Base64Two {
    public static void main(String[] args) {
        String orig = "hello world!";
        //编码加密
        String desc = Base64.getEncoder().encodeToString(orig.getBytes(StandardCharsets.UTF_8));
        System.out.println("加密后的字符串为:"+desc);

        //解码解密
        String unDecodeStr=new String(Base64.getDecoder().decode(desc),StandardCharsets.UTF_8);
        System.out.println("解密后的字符串为"+unDecodeStr);
    }

}
