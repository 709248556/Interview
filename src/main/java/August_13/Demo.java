package August_13;

/**
 * @author yanlianglong
 * @Title: demo.java
 * @Package August_13
 * @Description:
 * @date 2019/8/13 9:57
 */
public class Demo {
    public static void main(String args[]) {
        int num = 10;
        System.out.println(test(num));
    }

    public static int test(int b) {
        try {
            b += 10;
            return b;
        } catch (RuntimeException e) {
        } catch (Exception e2) {
        } finally {
            b += 10;
            return b;
        }
    }
}
