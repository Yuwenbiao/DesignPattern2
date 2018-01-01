package 命令模式.扩展.反悔问题;

/**
 * 修改后的Group类
 */
public abstract class Group {
    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();

    public void rollBack() {
        //根据日志进行回滚
    }
}
