package 访问者模式.通用代码;

/**
 * 抽象访问者
 */
public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 el1);

    public void visit(ConcreteElement2 el2);
}
