package August_13.Singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yanlianglong
 * @Title: LazySingletonVolatile.java
 * @Package August_13.Singleton
 * @Description:
 * @date 2019/8/13 16:32
 */
//volatile变量&&双重检查锁定  安全创建单例
public class LazySingletonVolatile {
    //volatile禁止重排
    private static volatile LazySingletonVolatile instance = null;

    private LazySingletonVolatile() {}

    //双重检查锁定
    public static LazySingletonVolatile newInstanceSafe () {
        if(null == instance){ //第一次检查
            synchronized (LazySingleton.class){
                if(null == instance){//第二次检查
                    instance = new LazySingletonVolatile();//不能重排序
              }
            }

        }
        return instance;
    }
}
