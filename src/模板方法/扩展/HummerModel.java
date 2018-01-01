package 模板方法.扩展;

public abstract class HummerModel {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm())
            this.alarm();
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }
}
