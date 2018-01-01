package 迭代器模式.通用代码;

/**
 * 抽象容器
 */
public interface Aggregate {
    //增加
    void add(Object object);

    //减少
    void remove(Object object);

    //迭代
    Iterator iterator();
}
