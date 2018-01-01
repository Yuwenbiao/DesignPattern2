package 设计原则.里式替换原则;

public class Handgun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("手枪");
    }
}
