package August_16;

/**
 * @author yanlianglong
 * @Title: Thread.java
 * @Package August_16
 * @Description:
 * @date 2019/8/16 10:49
 */
public class ThreadTest {
    public static void main(String[] args) throws Exception {
        final Object obj = new Object();
        Thread tl = new Thread() {
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();//释放了锁，进入等待队列
                        System.out.println("Thread tl run");
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        tl.start();//启动另一个线程，但本线程继续执行
        System.out.println("Start Thread tl");

        Thread.sleep(10000);
        Thread t2 = new Thread() {
            public void run() {
                synchronized (obj) {
                    obj.notifyAll();//唤醒所有竞争obj锁的线程，进入等待队列，竞争锁
                    System.out.println("Thread t2 run");
                }//释放obj锁
            }
        };
        t2.start();//启动另一个线程，但本线程继续执行
        System.out.println("Start Thread t2");
        Thread.sleep(100000);
    }
}
