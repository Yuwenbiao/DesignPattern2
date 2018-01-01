package 命令模式.扩展.最佳实践;

import 命令模式.通用代码.ConcreteReciver1;
import 命令模式.通用代码.Receiver;

/**
 * 具体的命令
 */
public class ConcreteCommand1 extends Command {
    //声明自己的默认接收者
    public ConcreteCommand1() {
        super(new ConcreteReciver1());
    }

    //设置新的接收者
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        //业务处理
        super.receiver.doSomething();
    }
}
