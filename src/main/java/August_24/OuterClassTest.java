package August_24;

/**
 * @author yan
 * @Title: OuterClassTest
 * @Package August_24
 * @Description:
 * @date 2019/8/24 20:55
 * @Version V1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass._InnerClass _InnerClass = new OuterClass._InnerClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }
}
