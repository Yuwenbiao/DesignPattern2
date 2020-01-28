package 单例模式;

/**
 * 线程不安全的单例
 *
 * @author yuwb@corp.21cn.com
 * @date 2020/1/28 20:33
 */
public class SingletonUnsafe {
    private static SingletonUnsafe singletonUnsafe = null;

    private SingletonUnsafe() {
    }

    public static SingletonUnsafe getSingletonUnsafe() {
        if (singletonUnsafe == null) {
            singletonUnsafe = new SingletonUnsafe();
        }
        return singletonUnsafe;
    }
}
