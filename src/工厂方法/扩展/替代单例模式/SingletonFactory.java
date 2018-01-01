package 工厂方法.扩展.替代单例模式;

import java.lang.reflect.Constructor;

/**
 * 负责生成单例的工厂类
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            //获取无参构造
            Constructor constructor = cl.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
