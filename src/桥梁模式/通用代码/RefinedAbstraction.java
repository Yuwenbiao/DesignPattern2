package 桥梁模式.通用代码;

/**
 * 具体抽象化角色
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void requset() {
        super.requset();
        super.getImp().doAnything();
    }
}
