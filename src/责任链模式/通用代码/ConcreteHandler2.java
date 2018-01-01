package 责任链模式.通用代码;

public class ConcreteHandler2 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        //定义自己的处理级别
        return null;
    }

    @Override
    protected Response echo(Request request) {
        //完成处理逻辑
        return null;
    }
}
