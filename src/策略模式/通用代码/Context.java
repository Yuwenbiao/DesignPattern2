package 策略模式.通用代码;

/**
 * 封装角色
 */
public class Context {
    //抽象策略
    private Strategy strategy = null;

    //构造函数设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //封装后的策略方法
    public void doAnything() {
        this.strategy.doSomething();
    }
}
