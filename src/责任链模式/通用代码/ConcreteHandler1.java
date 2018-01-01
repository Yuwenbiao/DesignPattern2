package 责任链模式.通用代码;

/**
 * 具体处理者
 */
public class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        //设置自己的处理级别
        return null;
    }

    @Override
    protected Response echo(Request request) {
        //完成处理逻辑
        return null;
    }
}
