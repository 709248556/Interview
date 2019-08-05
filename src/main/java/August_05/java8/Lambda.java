package August_05.java8;

import static sun.misc.PostVMInitHook.run;

/**
 * @author yanlianglong
 * @Title: Lambda.java
 * @Package August_05.java8
 * @Description:
 * @date 2019/8/5 14:41
 */
public class Lambda {
    public static void main(String[] args) {
        Runnable runnable = () ->System.out.println("Lambda1");
        new Thread(runnable).start();
        new Thread(()->{
            System.out.println("Lambda2");
        }).start();
    }
}
