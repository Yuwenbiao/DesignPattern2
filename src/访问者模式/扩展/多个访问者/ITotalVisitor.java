package 访问者模式.扩展.多个访问者;

import 访问者模式.IVisitor;

public interface ITotalVisitor extends IVisitor {
    //统计所有员工工资总和
    void totalSalary();
}
