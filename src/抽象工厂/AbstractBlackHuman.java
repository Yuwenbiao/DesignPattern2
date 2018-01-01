package 抽象工厂;

//黑色人种
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
