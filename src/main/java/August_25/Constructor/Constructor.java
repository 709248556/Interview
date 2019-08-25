package August_25.Constructor;

/**
 * @author yan
 * @Title: Constructor
 * @Package August_25
 * @Description:
 * @date 2019/8/25 22:05
 * @Version V1.0
 */

public class Constructor {
    public static void main(String[] args) {
        A ab = new B();
        ab.sout();
        ab = new B();
        ab = new A();
        ab.sout();
    }
}
/*
创建对象时构造器的调用顺序是：先初始化静态成员，然后调用父类构造器，再初始化非静态成员，最后调用自身构造器
 */