package 代理模式.扩展.强制代理;

/**
 * 被强制代理的接口类
 */
public interface IGamePlayer {
    //登录游戏
    void login(String name, String password);

    //杀怪
    void killBoss();

    //升级
    void upgrade();

    //每个人都可以找一下自己的代理
    IGamePlayer getProxy();
}
