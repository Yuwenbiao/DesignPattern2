package 设计原则.里式替换原则;

public class Soldier {
    //定义士兵的枪支
    private AbstractGun gun;
    //给士兵一直枪

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        gun.shoot();
    }
}
