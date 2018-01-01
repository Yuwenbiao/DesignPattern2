package 命令模式.扩展.未讲完的故事;

import 命令模式.Command;

/**
 * 修改后的增加需求
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.pg.add();
        super.cg.add();
        super.rg.plan();
    }
}
