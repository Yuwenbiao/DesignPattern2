package 桥梁模式.通用代码;

public class Client {
    public static void main(String[] args) {
        Implementor imp = new ConcreteImplementor1();
        Abstraction abs = new RefinedAbstraction(imp);
        abs.requset();
    }
}
