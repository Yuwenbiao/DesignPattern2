package 装饰模式;

/**
 * 查看成绩单
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SortDecorator(new HighScoreDecorator(new FouthGradeSchoolReport()));
        sr.report();
        sr.sign();
    }
}
