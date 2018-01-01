package 访问者模式.扩展.双分派;

/**
 * 抽象演员
 */
public abstract class AbsActor {
    //演员都能够演一个角色
    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    //可以演功夫戏
    public void act(KungFuRole role) {
        System.out.println("功夫");
    }
}
