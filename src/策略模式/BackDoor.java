package 策略模式;

/**
 * 乔国老开后门
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老开后门，让吴国太给孙权施加压力");
    }
}
