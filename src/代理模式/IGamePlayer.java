package 代理模式;

/**
 * 游戏者接口
 */
public interface IGamePlayer {
    //登录游戏
    void login(String user, String password);

    //杀怪，网络游戏的主要特色
    void killBoss();

    //升级
    void updagte();
}
