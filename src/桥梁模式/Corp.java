package 桥梁模式;

/**
 * 抽象公司
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSeiled();
    }
}
