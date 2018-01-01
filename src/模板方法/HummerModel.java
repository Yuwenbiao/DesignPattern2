package 模板方法;

/**
 * 抽象悍马模型
 */
public abstract class HummerModel {
    /*
    * 首先，这个模型要能够被发动起来，别管是手摇还是电力，反正要动起来，那这个实现要在实现类里
    * */
    public abstract void start();

    //能发动，也能停止
    public abstract void stop();

    //喇叭，滴滴叫或哔哔叫
    public abstract void alarm();

    //以前会响，不响则假
    public abstract void engineBoom();

    //模型会跑，不管是人推还是电力驱动
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
