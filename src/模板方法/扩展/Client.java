package 模板方法.扩展;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("H1是否需要喇叭：0不需要，1需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1 h1 = new HummerH1();
        if (type.equals("0"))
            h1.setAlarmFlag(false);
        h1.run();
        System.out.println("H2");
        HummerH2 h2 = new HummerH2();
        h2.run();
    }
}
