package 工厂方法;

/**
 * 女娲
 */
public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory yinyanglu = new HumanFactory();
        //女娲造白人
        System.out.println("白人");
        Human white = yinyanglu.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();
        System.out.println("黑人");
        Human black = yinyanglu.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();
        System.out.println("黄人");
        Human yellow = yinyanglu.createHuman(YellowHuman.class);
        yellow.getColor();
        yellow.talk();
    }
}
