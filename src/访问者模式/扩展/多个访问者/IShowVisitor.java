package 访问者模式.扩展.多个访问者;

import 访问者模式.IVisitor;

public interface IShowVisitor extends IVisitor {
    //展示报表
    public void report();
}
