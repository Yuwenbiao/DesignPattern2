package 访问者模式.扩展.双分派;

/**
 * 实现类
 */
public class IdiotRole implements Role {
    //弱智
    @Override
    public void accept(AbsActor absActor) {
        absActor.act(this);
    }
}
