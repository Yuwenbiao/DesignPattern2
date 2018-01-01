package 工厂方法.扩展.多个工厂类;

import 工厂方法.Human;

/**
 * 场景类NvWa
 */
public class NvWa {
    public static void main(String[] args) {
        Human black = (new BlackHumanFactory()).createHuman();
        black.getColor();
        black.talk();
        //...
    }
}
