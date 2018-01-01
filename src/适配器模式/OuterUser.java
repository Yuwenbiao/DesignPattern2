package 适配器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 劳动服务公司的人员实现
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "张三");
        baseInfoMap.put("mobileNumber", "电话");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "职位");
        officeInfo.put("officeTelNumber", "办公电话");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "员工的家庭电话是");
        homeInfo.put("homeAddress", "家庭地址");
        return homeInfo;
    }
}
