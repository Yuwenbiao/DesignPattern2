package 抽象工厂;

//黑色女性人种
public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
