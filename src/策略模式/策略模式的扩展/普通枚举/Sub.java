package 策略模式.策略模式的扩展.普通枚举;

/**
 * 具体策略
 */
public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
