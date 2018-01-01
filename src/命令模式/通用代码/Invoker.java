package 命令模式.通用代码;

/**
 * 调用者Invoker类
 */
public class Invoker {
    private Command command;

    //接收命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void action() {
        this.command.execute();
    }
}
