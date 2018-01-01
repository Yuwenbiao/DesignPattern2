package 代理模式.扩展.普通代理;

import 代理模式.IGamePlayer;

/**
 * 普通代理的游戏者
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    //构造函数限制谁能创建对象，并同时传递姓名

    public GamePlayer(IGamePlayer _gamePlayer, String name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登陆成功");
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
