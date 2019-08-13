package August_13.Singleton;

/**
 * @author yanlianglong
 * @Title: LazySingleton.java
 * @Package August_13.Singleton
 * @Description:
 * @date 2019/8/13 16:15
 */

//懒汉模式，在需要的时候才去创建的单例对象
public class LazySingleton {
    private static LazySingleton instance = null;
    //单例类的构造方法都是私有的，防止外部创建单例类的对象
    private LazySingleton() {}

    //每一次访问newInstanceSafe方法，都需要加解锁，影响性能
    public static synchronized LazySingleton newInstanceSafe () {
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }

    //双重检查锁定
    //TODO 不安全！！
    public static LazySingleton newInstanceUnsafe () {
        if(null == instance){ //第一次检查
            synchronized (LazySingleton.class){
                if(null == instance){//第二次检查
                    //TODO 出错！
                    // 指令重排，有可能会导致instance有了地址，但还没初始化，而另一个线程调用newInstanceUnsafe，得到了还为初始化的对象
                    instance = new LazySingleton();
                }
            }

        }
        return instance;
    }
}
