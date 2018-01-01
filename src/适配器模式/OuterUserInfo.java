package 适配器模式;

import java.util.Map;

/**
 * 中转角色，类适配器
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();//员工基本信息
    private Map homeInfo = super.getUserHomeInfo();//员工家庭信息
    private Map officeInfo = super.getUserOfficeInfo();//员工办公信息

    @Override
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeNumber() {
        String officeNumber = (String) officeInfo.get("officeNumber");
        System.out.println(officeNumber);
        return officeNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
