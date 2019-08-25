package August_25.Constructor;

/**
 * @author yan
 * @Title: A
 * @Package August_25.Constructor
 * @Description:
 * @date 2019/8/25 22:07
 * @Version V1.0
 */

public class A {
    static {
        System.out.println("1");
    }

    public A() {
        System.out.println("2");
    }

    public void sout() {
        System.out.println("A sout");
    }
}
