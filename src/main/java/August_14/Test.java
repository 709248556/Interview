package August_14;

/**
 * @author yanlianglong
 * @Title: Test.java
 * @Package August_14
 * @Description:
 * @date 2019/8/14 10:11
 */
public class Test {
    int count = 21;//相当于局部变量，每次new进入后都会初始化并赋值21

    public void count() {
        System.out.println(++count);
    }

    public static void main(String args[]) {
        new Test().count();
        new Test().count();
    }
}
