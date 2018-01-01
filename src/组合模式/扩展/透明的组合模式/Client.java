package 组合模式.扩展.透明的组合模式;

public class Client {
    //通过递归遍历树
    public static void display(Component root){
        for(Component c:root.getChildren()){
            if(c instanceof Leaf){ //叶子节点
                c.doSomething();
            }else{ //树枝节点
                display(c);
            }
        }
    }
}
