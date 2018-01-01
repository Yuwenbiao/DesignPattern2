package 责任链模式;

/**
 * 丈夫类
 */
public class Husband extends Handler {
    //丈夫只处理妻子的请求
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("妻子向丈夫请示");
        System.out.println(women.getRequest());
        System.out.println("丈夫同意");
    }
}
