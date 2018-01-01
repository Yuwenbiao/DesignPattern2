package 设计原则.里式替换原则;

public class Client {
    public static void main(String[] args) {
        Soldier sanMao = new Soldier();
        sanMao.setGun(new Rifle());
        sanMao.killEnemy();

        sanMao.setGun(new ToyGun());
        sanMao.killEnemy();
    }
}
