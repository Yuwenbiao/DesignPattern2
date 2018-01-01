package 策略模式.策略模式的扩展.普通枚举;

/**
 * 上下文
 */
public class Context {
    private Calculator cal = null;

    public Context(Calculator cal) {
        this.cal = cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }
}
