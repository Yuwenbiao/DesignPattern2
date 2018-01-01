package 代理模式;

/**
 * 游戏者
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    //通过构造函数传递名称

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名：" + user + "密码为：" + password);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    @Override
    public void updagte() {
        System.out.println(this.name + "又升了一级");
    }
}
