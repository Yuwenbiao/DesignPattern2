package 适配器模式;

/**
 * 实现类
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("电话号码");
        return null;
    }

    @Override
    public String getOfficeNumber() {
        System.out.println("办公室电话");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭电话");
        return null;
    }
}
