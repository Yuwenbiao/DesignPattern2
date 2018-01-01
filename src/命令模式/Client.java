package 命令模式;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker XiaoSan = new Invoker();
        //客户要求增加一项需求
        Command command = new AddRequirementCommand();
        XiaoSan.setCommand(command);
        XiaoSan.action();

        Command command1 = new DeletePageCommand();
        XiaoSan.setCommand(command1);
        XiaoSan.action();
    }
}
