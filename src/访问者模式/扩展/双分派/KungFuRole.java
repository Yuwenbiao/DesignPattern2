package 访问者模式.扩展.双分派;

/**
 * 实现类
 */
public class KungFuRole implements Role {
    //武功天下第一
    @Override
    public void accept(AbsActor absActor) {
        absActor.act(this);
    }
}
