package 适配器模式;

/**
 * 员工信息接口
 */
public interface IUserInfo {
    //获得用户姓名
    String getUserName();

    //获得家庭地址
    String getHomeAddress();

    //手机号码
    String getMobileNumber();

    //办公电话
    String getOfficeNumber();

    //职位
    String getJobPosition();

    //获得家庭电话
    String getHomeTelNumber();
}
