package momo.lan.java8.reflect;

/**
 * @program: java-jdk-point
 * @description: 通过spring的LocalVariableTableParameterNameDiscoverer
 * @author: zhanghui2018
 * @create: 2019-01-30 17:55
 */
public class ReflectSpring {
    /*public static void main(String[] args) {
        List<String> paramterNames = getParamterName(StaffMark.class, "fun1");
        paramterNames.forEach((x) -> System.out.println(x));
    }

    public static void fun1(String aaa, Integer bbb) {

    }

    public static List<String> getParamterName(Class clazz, String methodName) {
        LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (methodName.equals(method.getName())) {
                //获取到该方法的参数们
                String[] params = u.getParameterNames(method);
                return Arrays.asList(params);
            }
        }
        return null;
    }*/
    /*输出：
        aaa
        bbb*/

}
