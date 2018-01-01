package 代理模式.扩展.动态代理;

import 代理模式.扩展.强制代理.GamePlayer;
import 代理模式.扩展.强制代理.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理的场景类
 */
public class Client {
    public static void main(String[] args) throws Throwable {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏，记下时间戳
        System.out.println("开始");
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        //登录
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束");
    }
}
