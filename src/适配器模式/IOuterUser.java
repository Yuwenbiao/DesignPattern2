package 适配器模式;

import java.util.Map;

/**
 * 劳动服务公司的人员信息接口
 */
public interface IOuterUser {
    //基本信息
    Map getUserBaseInfo();

    //工作区域信息
    Map getUserOfficeInfo();

    //用户家庭信息
    Map getUserHomeInfo();
}
