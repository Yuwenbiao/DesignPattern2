package 代理模式.扩展.代理是有个性的;


import 代理模式.IGamePlayer;

/**
 * 代理类
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }

    @Override
    public void login(String name, String password) {
        this.gamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void updagte() {
        this.gamePlayer.updagte();
        this.count();
    }
}
