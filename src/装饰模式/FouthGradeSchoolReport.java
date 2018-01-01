package 装饰模式;

/**
 * 四年级成绩单
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("62,98");
    }

    @Override
    public void sign() {
        System.out.println("家长签名为");
    }
}
