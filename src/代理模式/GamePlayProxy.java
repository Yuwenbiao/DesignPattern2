package 代理模式;

/**
 * 代练者
 */
public class GamePlayProxy implements IGamePlayer {
    private IGamePlayer player = null;
    //通过构造函数传递要对谁进行代练

    public GamePlayProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void login(String user, String password) {
        this.player.login(user, password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void updagte() {
        this.player.updagte();
    }
}
