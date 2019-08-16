package August_16;

/**
 * @author yanlianglong
 * @Title: HelloSogou.java
 * @Package August_16
 * @Description:
 * @date 2019/8/16 10:23
 */
public class HelloSogou {
    public static synchronized void main(String[] a) {
        Thread t = new Thread() {
                    public void run() {
                        Sogou();
                    }
                };
        t.start();
        System.out.print("Hello");
    }
    static synchronized void Sogou() {
        System.out.print("Sogou");
    }
}
