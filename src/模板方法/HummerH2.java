package 模板方法;

/**
 * H2型号悍马模型
 */
public class HummerH2 extends HummerModel {
    @Override
    public void start() {
        System.out.println("H2发动");
    }

    @Override
    public void stop() {
        System.out.println("H2停车");
    }

    @Override
    public void alarm() {
        System.out.println("H2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("H2引擎响");
    }
}
