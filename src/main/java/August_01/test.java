package August_01;

import java.util.logging.Logger;

/**
 * @author yanlianglong
 * @Title: test.java
 * @Package August_01
 * @Description:
 * @date 2019/8/1 10:06
 */

/*
public static Integer valueOf(int i) {
    if (i >= IntegerCache.low && i <= IntegerCache.high)
        return IntegerCache.cache[i + (-IntegerCache.low)];
    return new Integer(i);
}
IntegerCache是一个静态内部类，IntegerCache.low=-128 IntegerCache.high = 127，
所以当-128-127时，直接返回的是IntegerCache.cache 中的同一个对象，而不在这个范围时返回的是new出来的对象
 */
public class test {
    Logger logger = Logger.getLogger("test");
    public static void main(String[] args) {
        Integer a = 0;
        Integer b = 0;
        System.out.println(a==b);
        Integer c = 128;
        Integer d = 128;
        System.out.println(c==d);
        Integer e = -129;
        Integer f = -129;
        System.out.println(e==f);
    }
}
