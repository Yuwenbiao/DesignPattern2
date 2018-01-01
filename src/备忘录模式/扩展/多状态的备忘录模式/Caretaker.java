package 备忘录模式.扩展.多状态的备忘录模式;

/**
 * 备忘录管理者
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
