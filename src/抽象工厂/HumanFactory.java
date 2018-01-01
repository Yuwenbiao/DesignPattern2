package 抽象工厂;

//八卦炉（车间，有三条生产线）
public interface HumanFactory {
    Human createYellowHuman();

    Human createBlackHuman();

    Human createWhiteHuman();
}
