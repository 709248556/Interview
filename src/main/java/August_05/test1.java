package August_05;

/**
 * @author yanlianglong
 * @Title: test1.java
 * @Package August_05
 * @Description:
 * @date 2019/8/5 9:48
 */
public class test1 {
    public static void main(String arg[]) {
        Square a, b, c;
        a = new Square(42L);
        b = new Square(42L);
        c = b;
        long s = 42L;
        System.out.println(a == b);
//        System.out.println(s == a);   //false
        System.out.println(b == c);
        System.out.println(a.equals(s));

        /**
         * 虽然==比较的是地址值，但是integer在-128～127的范围内，使用的是常量池的值，因此j 的地址值也是与i 的一样
         *
         * Integer重写了equals方法会先转成int再进行比较
         */
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }
}
