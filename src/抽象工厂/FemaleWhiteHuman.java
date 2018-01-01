package 抽象工厂;

//白色女性人种
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
