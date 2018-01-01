package 工厂方法.扩展.简单工厂模式;

import 工厂方法.Human;
import 工厂方法.WhiteHuman;

public class NvWa {
    public static void main(String[] args) {
        Human white = HumanFactory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();
    }
}
