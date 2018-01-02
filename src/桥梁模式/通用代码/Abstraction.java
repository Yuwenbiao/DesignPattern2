package 桥梁模式.通用代码;

/**
 * 抽象化角色
 */
public abstract class Abstraction {
    private Implementor imp;

    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    public void requset() {
        this.imp.doSomething();
    }

    public Implementor getImp() {
        return imp;
    }
}
