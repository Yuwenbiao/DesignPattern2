package 观察者模式.通用代码;

public class ConcreteObserver implements Observer {
    //实现更新方法
    @Override
    public void update() {
        System.out.println("接收到的消息，并开始处理");
    }
}
