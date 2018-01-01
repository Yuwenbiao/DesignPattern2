package 访问者模式.扩展.双分派;

public class YoungActor extends AbsActor {
    //年轻演员喜欢演功夫
    @Override
    public void act(KungFuRole role) {
        System.out.println("最喜欢功夫");
    }
}
