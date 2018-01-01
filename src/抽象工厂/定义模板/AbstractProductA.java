package 抽象工厂.定义模板;

/**
 * 抽象产品类
 */
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod() {

    }

    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
