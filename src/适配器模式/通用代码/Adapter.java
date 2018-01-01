package 适配器模式.通用代码;

/**
 * 适配器角色
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
