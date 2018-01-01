package 代理模式.扩展.强制代理;

/**
 * 直接访问真实角色
 */
public class Client {
    public static void main(String[] args) {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        //获得指定的代理
        IGamePlayer proxy = player.getProxy();
        //开始打游戏，记下时间
        System.out.println("开始");
        proxy.login("zhangsan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏的时间
        System.out.println("结束");
    }
}
