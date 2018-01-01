package 代理模式.扩展.动态代理.模型;

/**
 * 通知接口实现
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }
}
