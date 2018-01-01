package 组合模式;

import java.util.ArrayList;

/**
 * 场景类
 */
public class Client {
    //遍历整棵树,只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinateList();
        String info = "";
        for (Corp s : subordinateList) {
            if (s instanceof Leaf) { //是员工就直接获得信息
                info = info + s.getInfo() + "\n";
            } else { //是个小头目
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
            }
        }
        return info;
    }
}
