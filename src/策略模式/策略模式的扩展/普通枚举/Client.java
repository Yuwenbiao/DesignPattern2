package 策略模式.策略模式的扩展.普通枚举;

/**
 * 场景类
 */
public class Client {
    //加符号
    public final static String ADD = "+";
    //减符号
    public final static String SUB = "-";

    public static void main(String[] args) {
        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        Context context = null;
        //判断初始化哪个策略
        if (symbol.equals(ADD)) {
            context = new Context(new Add());
        } else if (symbol.equals(SUB)) {
            context = new Context(new Sub());
        }
        System.out.println(context.exec(a, b, symbol));
    }
}
