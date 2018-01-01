package 适配器模式.通用代码;

public class Client {
    public static void main(String[] args) {
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        //适配器
        Target target1 = new Adapter();
        target1.request();
    }

}
