package 命令模式.通用代码;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReciver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
