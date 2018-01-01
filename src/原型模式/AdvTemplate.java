package 原型模式;

/**
 * 广告信模板
 */
public class AdvTemplate {
    //广告信名称
    private String advSubject = "XX 银行国庆信用卡抽奖活动";
    //广告信内容
    private String advContext = "国庆抽奖活动通知";

    //获得广告信名称
    public String getAdvSubject() {
        return advSubject;
    }

    //取得广告信的内容
    public String getAdvContext() {
        return advContext;
    }
}
