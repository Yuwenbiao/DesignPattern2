package 原型模式.通用代码;

/**
 * 原型模式通用代码
 */
public class PrototypeClass implements Cloneable {
    //覆写父类Object方法
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
