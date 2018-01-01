package 抽象工厂;

//黄色人种
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄人黄皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话");
    }
}
