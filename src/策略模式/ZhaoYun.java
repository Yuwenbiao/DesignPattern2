package 策略模式;

public class ZhaoYun {
    //赵云出场了，根据诸葛亮的交代，依次拆开妙计
    public static void main(String[] args) {
        Context context;
        //第一个
        context = new Context(new BackDoor());
        context.operate();
        //第二个
        context = new Context(new GivenGreenLight());
        context.operate();
        //第三个
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
