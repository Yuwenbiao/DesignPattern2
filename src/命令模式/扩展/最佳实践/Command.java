package 命令模式.扩展.最佳实践;

import 命令模式.通用代码.Receiver;

/**
 * 完美的Command类
 */
public abstract class Command {
    //定义一个子类的全局共享变量
    protected final Receiver receiver;
    //实现类必须定义一个接收者
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    //每个命令类必须有一个执行命令的方法
    public abstract void execute();
}
