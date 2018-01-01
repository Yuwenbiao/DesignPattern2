package 命令模式.通用代码;

/**
 * 抽象的Command类
 */
public abstract class Command {
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
