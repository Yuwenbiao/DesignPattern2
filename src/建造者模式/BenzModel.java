package 建造者模式;

/**
 * 奔驰模型代码
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰跑");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎");
    }
}
