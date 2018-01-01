package 单例模式;

/**
 * 单例模式的通用代码
 */
public class Singleton {
    private static final Singleton singletom = new Singleton();

    //限制产生多个对象
    private Singleton() {

    }

    //通过该方法获取实例对象
    public static Singleton getSingletom() {
        return singletom;
    }

    //类中的其他方法，尽量是static
    public static void doSomething() {

    }
}
