package 命令模式.扩展.反悔问题;

import 命令模式.Command;

/**
 * 撤销命令
 */
public class CancelDeletePageCommand extends Command {
    @Override
    public void execute() {
//        super.pg.rollBack();
    }
}
