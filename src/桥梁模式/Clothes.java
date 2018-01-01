package 桥梁模式;

/**
 * 服装
 */
public class Clothes extends Product {
    @Override
    public void beProducted() {
        System.out.println("衣服");
    }

    @Override
    public void beSeiled() {
        System.out.println("销售");
    }
}
