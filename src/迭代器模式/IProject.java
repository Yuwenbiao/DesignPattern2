package 迭代器模式;

/**
 * 项目信息接口
 */
public interface IProject {
    //从老板这里看到的就是项目信息
    String getProjectInfo();

    //增加项目
    void add(String name, int num, int cost);

    //获得一个可以被遍历的对象
    IProjectIterator iterator();
}
