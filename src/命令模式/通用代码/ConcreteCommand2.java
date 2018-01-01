package 命令模式.通用代码;

/**
 * 具体的Command类
 */
public class ConcreteCommand2 extends Command {
    //哪个Receiver类进行命令处理
    private Receiver receiver;

    //通过构造函数传递接收者
    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
