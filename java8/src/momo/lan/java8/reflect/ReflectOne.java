package momo.lan.java8.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-jdk-point
 * @description: 通过Java8的Parameter类
 * @author: zhanghui2018
 * @create: 2019-01-30 16:47
 */

public class ReflectOne {
    /*
        现在，Java 8开始在class文件中保留参数名，给反射带来了极大的便利。jdk8增加了类Parameter
        输出：
        arg0
        arg1
        哈哈，被骗了有木有？其实并不是，因为java8为了保持向下兼容，默认编译是不能获取到参数名称的。需要满足下面两个条件

        1、JDK版本必须是1.8及以上
        2、编译时候必须有编译选项：javac -parameters打开，默认是关闭的
        附：idea设置保留参数名：
        在 preferences-》Java Compiler->设置模块字节码版本1.8，Javac Options中的 Additional command line parameters: -parameters

        这样设置之后，我们再运行上面代码，发现输出的结果为：
        输出：
        aaa
        bbb
     */
    public static void main(String[] args) {
        List<String> paramterNames = getParameterNameJava8(ReflectOne.class, "fun1");
        paramterNames.forEach((x) -> System.out.println(x));
    }

    public static void fun1(String aaa, Integer bbb) {

    }

    public static List<String> getParameterNameJava8(Class clazz, String methodName) {
        List<String> paramterList = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (methodName.equals(method.getName())) {
                //直接通过method就能拿到所有的参数
                Parameter[] params = method.getParameters();
                for (Parameter parameter : params) {
                    paramterList.add(parameter.getName());
                }

            }
        }

        return paramterList;
    }

}
