package 适配器模式;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //没有与外系统连接的时候
        IUserInfo youngGirl = new UserInfo();
        //从数据库查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }

        IUserInfo youngGirl2 = new OuterUserInfo();
        //从数据库查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl2.getMobileNumber();
        }
    }
}
