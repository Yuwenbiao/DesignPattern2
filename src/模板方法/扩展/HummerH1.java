package 模板方法.扩展;

/**
 * H1型号悍马模型
 */
public class HummerH1 extends HummerModel {
    private boolean alarmFlag = true;

    @Override
    public void start() {
        System.out.println("H1发动");
    }

    @Override
    public void stop() {
        System.out.println("H1停车");
    }

    @Override
    public void alarm() {
        System.out.println("H1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("H1引擎声");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要想喇叭，由用户决定
    public void setAlarmFlag(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
