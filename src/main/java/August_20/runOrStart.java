package August_20;

/**
 * @author yanlianglong
 * @Title: runOrStart.java
 * @Package August_20
 * @Description:
 * @date 2019/8/20 10:24
 */
public class runOrStart extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("run"+" ");
    }

    public static void main(String[] args) {
        runOrStart example = new runOrStart();
        example.run();
        System.out.print("main"+" ");
    }
}
/**
 * 这道题要搞清楚run和start的区别
 * start是启动一个线程,而run是调用方法
 */
