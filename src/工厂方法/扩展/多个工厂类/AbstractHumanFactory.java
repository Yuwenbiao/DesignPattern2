package 工厂方法.扩展.多个工厂类;

import 工厂方法.Human;

/**
 * 多工厂模式的抽象工厂类
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();
}
