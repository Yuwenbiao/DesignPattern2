package 代理模式.扩展.动态代理.模型;

import java.lang.reflect.InvocationHandler;

/**
 * 动态代理的场景类
 */
public class Client {
    public static void main(String[] args) {
//        //定义一个主题
//        Subject subject = new RealSubject();
//        //定义一个Handler
//        InvocationHandler handler = new MyInvocationHandler(subject);
//        //定义主题的代理类
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
//        //代理行为
//        proxy.doSomething("Finish");

        //定义一个主题
        Subject subject = new RealSubject();
        //定义主题的代理类
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
