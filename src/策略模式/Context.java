package 策略模式;

/**
 * 锦囊
 */
public class Context {
    //构造函数，你要使用哪个妙计
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        strategy = strategy;
    }

    //使用计谋
    public void operate() {
        this.strategy.operate();
    }
}
