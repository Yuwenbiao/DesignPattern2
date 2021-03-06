package 工厂方法.扩展.简单工厂模式;

import 工厂方法.Human;

/**
 * 简单工厂模式中断工厂类
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产出的人种
        Human human = null;
        try {
            //产生一个人种
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
