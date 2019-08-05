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
    }
}
