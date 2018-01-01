package 责任链模式;

/**
 * 有处理权的人员接口
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler nextHandler;

    //每个类说明自己能处理的请求
    public Handler(int level) {
        this.level = level;
    }

    //处理女性要求
    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null)
                this.nextHandler.handleMessage(women);
            else System.out.println("没地方请示了，按不同意处理");
        }
    }

    //如果不属于你的请求，则将请求传递给下一位
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    //友情示则回应
    protected abstract void response(IWomen women);
}
