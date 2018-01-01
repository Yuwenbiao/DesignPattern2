package 代理模式.扩展.普通代理;

import 代理模式.IGamePlayer;

public class Client {
    public static void main(String[] args) {
        //定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
        //开始打游戏，记下时间戳
        System.out.println("开始的时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");

        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.updagte();
        //记录结束游戏的时间戳
        System.out.println("结束时间为：");
    }
}
