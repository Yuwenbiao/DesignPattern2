package 工厂方法.通用源码;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        //继续业务处理
    }
}
