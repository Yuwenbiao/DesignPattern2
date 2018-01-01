package 备忘录模式.扩展.封装得更好一点;

/**
 * 备忘录管理者
 */
public class Caretaker {
    //备忘录对象
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
