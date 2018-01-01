package 桥梁模式;

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("IPod");
    }

    @Override
    public void beSeiled() {
        System.out.println("销售");
    }
}
