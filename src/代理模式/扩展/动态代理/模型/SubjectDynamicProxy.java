package 代理模式.扩展.动态代理.模型;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
