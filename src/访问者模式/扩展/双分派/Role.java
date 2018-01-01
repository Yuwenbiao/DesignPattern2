package 访问者模式.扩展.双分派;

/**
 * 角色接口
 */
public interface Role {
    //演员要扮演的角色
    void accept(AbsActor absActor);
}
