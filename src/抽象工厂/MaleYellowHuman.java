package 抽象工厂;

//黄色男性人种
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
