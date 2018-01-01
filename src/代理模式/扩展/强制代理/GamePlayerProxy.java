package 代理模式.扩展.强制代理;

/**
 * 强制代理的代理类
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer=null;
    //构造函数传递用户名

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String name, String password) {
        this.gamePlayer.login(name,password);
    }

    @Override
    public void killBoss() {
this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
