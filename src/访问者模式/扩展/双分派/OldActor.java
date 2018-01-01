package 访问者模式.扩展.双分派;

public class OldActor extends AbsActor {
    //不演打戏
    @Override
    public void act(KungFuRole role) {
        System.out.println("不演打戏");
    }
}
