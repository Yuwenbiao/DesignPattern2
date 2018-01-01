package 备忘录模式.通用代码;

/**
 * 备忘录角色
 */
public class Memento {
    //发起人的内部状态
    private String state = "";
    //构造函数传递参数
    public Memento(String _state){
        this.state = _state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
