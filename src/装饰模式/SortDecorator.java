package 装饰模式;

/**
 * 排名情况修饰
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉排名情况
    private void reportSort() {
        System.out.println("排名38");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
