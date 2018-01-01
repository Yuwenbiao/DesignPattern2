package 抽象工厂;

//白色男性人种
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
