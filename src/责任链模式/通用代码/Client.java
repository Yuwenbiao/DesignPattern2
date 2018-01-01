package 责任链模式.通用代码;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //设置链中的阶段顺序
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
