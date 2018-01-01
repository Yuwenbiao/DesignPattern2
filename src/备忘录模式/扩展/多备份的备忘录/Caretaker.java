package 备忘录模式.扩展.多备份的备忘录;

import 备忘录模式.通用代码.Memento;

import java.util.HashMap;

/**
 * 备忘录管理员
 */
public class Caretaker {
    //容纳备忘录的容器
    private HashMap<String, Memento> memMap = new HashMap<String, Memento>();

    public Memento getMemento(String idx) {
        return memMap.get(idx);
    }

    public void setMemento(String idx, Memento memento) {
        this.memMap.put(idx, memento);
    }
}
