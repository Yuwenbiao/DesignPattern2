package 门面模式;

public class Police {
    //检查信件
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "信件已经检查过了");
    }
}
