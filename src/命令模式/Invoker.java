package 命令模式;

/**
 * 负责人
 */
public class Invoker {
    //什么命令
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户的命令
    public void action() {
        this.command.execute();
    }
}
