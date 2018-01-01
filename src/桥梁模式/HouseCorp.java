package 桥梁模式;

/**
 * 房地产公司
 */
public class HouseCorp extends Corp {
    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司");
    }
}
