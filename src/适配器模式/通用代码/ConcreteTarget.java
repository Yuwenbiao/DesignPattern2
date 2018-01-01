package 适配器模式.通用代码;

/**
 * 目标角色的实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标角色实现类");
    }
}
