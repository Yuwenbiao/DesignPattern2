package 访问者模式.扩展.统计功能;

/**
 * 具体访问者
 */
public class Visitor implements IVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //计算部门经理的工资总和
    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary
                * MANAGER_COEFFICIENT;
    }

    //计算普通员工的工资总和
    private void calCommonSlary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary +
                salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    //获得所有员工的工资总和
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }
    //访问普通员工，打印出报表
    public void visit(CommonEmployee commonEmployee) {
    }

    //访问部门经理，打印出报表
    public void visit(Manager manager) {
    }
}
