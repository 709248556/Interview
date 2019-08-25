package August_25.Constructor;

/**
 * @author yan
 * @Title: B
 * @Package August_25.Constructor
 * @Description:
 * @date 2019/8/25 22:07
 * @Version V1.0
 */

public class B extends A{
    static {
        System.out.println("a");
    }

    public B() {
        System.out.println("b");
    }

    public void sout(){
        System.out.println("B sout");
    }
}
