package 单例模式;

public class Emperor {
    private static final Emperor emperor = new Emperor();//初始化一个皇帝

    //构造方法私有，不允许有多个皇帝
    private Emperor() {

    }

    //获取单一实例
    public static Emperor getInstance() {
        return emperor;
    }

    //动作
    public static void say() {
        System.out.println("我是皇帝");
    }
}
