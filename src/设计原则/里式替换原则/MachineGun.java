package 设计原则.里式替换原则;

public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪");
    }
}
