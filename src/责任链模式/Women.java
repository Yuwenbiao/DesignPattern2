package 责任链模式;

/**
 * 古代妇女
 */
public class Women implements IWomen {
    /*
    * 通过一个int类型的参数来描述妇女的状况
    * 1-未出嫁
    * 2-出嫁
    * 3-守寡
    * */
    private int type = 0;
    //妇女请示
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
