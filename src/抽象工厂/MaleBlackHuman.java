package 抽象工厂;

//黑色男性人种
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
