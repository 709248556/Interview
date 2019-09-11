package August_13.Singleton;

/**
 * @author yanlianglong
 * @Title: LazySingletonInternal.java
 * @Package August_13.Singleton
 * @Description:
 * @date 2019/8/13 16:39
 */

//静态内部类单例模式
/**
 *  JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前），会执行类的初始化。
 *  在执行类的初始化时期，JVM会去获取一个锁。这个锁可以同步多个线程对一个类的初始化，
 *  基于这个特性，可以实现另一种线程安全的延迟初始化方案。
 */
public class LazySingletonInternal {
    private LazySingletonInternal(){}

    //内部类
    private static class LazySingletonInternalHolder {
        //静态字段
        public static LazySingletonInternal instance = new LazySingletonInternal();
    }

    //创建单例模式入口
    public static LazySingletonInternal newLazySingletonInternal(){
        return LazySingletonInternalHolder.instance; //数据结构，返回的是instance的地址
    }

}
