package 命令模式;

/**
 * 增加需求的命令
 */
public class AddRequirementCommand extends Command {
    //执行增加一项需求的命令
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
