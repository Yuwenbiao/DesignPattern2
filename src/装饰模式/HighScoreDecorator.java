package 装饰模式;

/**
 * 最高成绩修饰
 */
public class HighScoreDecorator extends Decorator {
    //构造函数
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //汇报最高成绩
    private void reportHighScore() {
        System.out.println("78,75");
    }

    //在看成绩单之前告诉他最高成绩
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
