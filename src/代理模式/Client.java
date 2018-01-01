package 代理模式;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //定义一个玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个代练者
        IGamePlayer proxy = new GamePlayProxy(player);
        //开始打游戏，记下时间
        System.out.println("开始时间为：");
        proxy.login("zhangsan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.updagte();
        //记录游戏结束时间
        System.out.println("结束时间是：");
    }
}
