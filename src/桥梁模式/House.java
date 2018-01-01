package 桥梁模式;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("房子");
    }

    @Override
    public void beSeiled() {
        System.out.println("销售");
    }
}
