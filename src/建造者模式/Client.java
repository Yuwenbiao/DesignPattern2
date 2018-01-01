package 建造者模式;

import java.util.ArrayList;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //客户告诉公司，公司告诉我老大，说要这样一个模型，这样一个顺序，然后我来制造
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        //要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();
        //制造出宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();
        Director director = new Director();
//        //1万辆A类型的奔驰车
//        for (int i = 0; i < 10000; i++) {
//            director.getABenzModel().run();
//        }
//        //100万辆B类型的奔驰车
//        for (int i = 0; i < 1000000; i++) {
//            director.getABenzModel().run();
//        }
    }
}
