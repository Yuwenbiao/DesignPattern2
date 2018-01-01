package 建造者模式.通用代码;

/**
 * 具体建造者
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();

    //设置产品零件
    @Override
    public void setPart() {
        //...
    }

    //组建一个产品
    @Override
    public Product buildProduct() {
        return product;
    }
}
