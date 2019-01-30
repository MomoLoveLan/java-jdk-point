package momo.lan.java8.reflect;

/**
 * @program: java-jdk-point
 * @description: 介绍
 * @author: zhanghui2018
 * @create: 2019-01-30 17:44
 */
public class Reflect介绍 {
    /*
        方法的参数名，在很多时候我们是需要反射得到的。但是在java8之前，代码编译为class文件后，
        方法参数的类型是固定的，但参数名称却丢失了，这和动态语言严重依赖参数名称形成了鲜明对比。
        （java是静态语言，所以入参名称叫什么其实无所谓的）。
        虽然名称无所谓，但很多时候，我们需要此名称来做更好的安排.

        获取方法参数名称
        方法一：采用javassit包获取，很麻烦，此处省略
        方法二：通过spring的LocalVariableTableParameterNameDiscoverer
        方法三：通过Java8的Parameter类
     */
}
