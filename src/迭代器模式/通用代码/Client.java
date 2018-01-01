package 迭代器模式.通用代码;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //声明容器
        Aggregate agg = new ConcreteAggregate();
        //产生对象数据放进去
        agg.add("abc");
        agg.add("jjjj");
        agg.add("jjj");
        //遍历
        Iterator iterator = agg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
