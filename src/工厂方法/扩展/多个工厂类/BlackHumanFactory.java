package 工厂方法.扩展.多个工厂类;

import 工厂方法.BlackHuman;
import 工厂方法.Human;

/**
 * 黑色人种的创建工厂实现
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
