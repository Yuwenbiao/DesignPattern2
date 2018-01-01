package 抽象工厂;
//白色人种
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("白人说话");
    }
}
