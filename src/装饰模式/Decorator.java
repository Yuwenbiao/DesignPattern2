package 装饰模式;

/**
 * 修饰的抽象类
 */
public abstract class Decorator extends SchoolReport {
    //首先我要知道是哪个成绩单
    private SchoolReport sr;

    //构造函数，把成绩单传递过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    //成绩单还是要被看到的
    @Override
    public void report() {
        this.sr.report();
    }

    //看完还是要签名的
    @Override
    public void sign() {
        this.sr.sign();
    }
}
