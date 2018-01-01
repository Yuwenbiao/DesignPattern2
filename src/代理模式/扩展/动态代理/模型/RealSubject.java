package 代理模式.扩展.动态代理.模型;

/**
 * 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        //逻辑
    }
}
