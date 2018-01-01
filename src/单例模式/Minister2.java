package 单例模式;

/**
 * 臣子参拜皇上
 */
public class Minister2 {
    public static void main(String[] args) {
        //定义五个大臣
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor2 emperor = Emperor2.getInstance();
            System.out.println("第" + (i + 1) + "个大臣参拜的是：");
            emperor.say();
        }
    }
}
