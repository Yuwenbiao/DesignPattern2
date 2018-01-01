package 工厂方法.扩展.延迟加载的工厂类;

import 工厂方法.BlackHuman;
import 工厂方法.Human;
import 工厂方法.YellowHuman;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 */
public class ProductFactory {
    private static final Map<String, Human> map = new HashMap<>();

    public static synchronized Human createHuman(String type) throws Exception {
        Human human = null;
        //如果Map中已经有这个对象
        if (map.containsKey(type)) {
            human = map.get(type);
        } else {
            if (type.equals("black")) {
                human = new BlackHuman();
            } else {
                human = new YellowHuman();
            }
            map.put(type, human);
        }
        return human;
    }
}
