package 享元模式.扩展.线程安全;

import 享元模式.SignInfo;

/**
 * 多线程场景
 */
public class MultiThread extends Thread {
    private SignInfo signInfo;

    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;
    }

    @Override
    public void run() {
        if (!signInfo.getId().equals(signInfo.getLocation())) {
            System.out.println("编号：" + signInfo.getId());
            System.out.println("考试地址：" + signInfo.getLocation());
            System.out.println("线程不安全了！");
        }
    }
}
