package 策略模式.通用代码;

/**
 * 具体策略角色
 */
public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("策略2");
    }
}
