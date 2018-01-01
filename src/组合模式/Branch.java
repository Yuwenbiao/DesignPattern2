package 组合模式;

import java.util.ArrayList;

/**
 * 树枝节点
 */
public class Branch extends Corp {
    //领导下面有哪些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<>();
    //构造函数
    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    //增加一个下属，可能是小头目，也可能是小兵
    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    //下属
    public ArrayList<Corp> getSubordinateList() {
        return subordinateList;
    }
}
