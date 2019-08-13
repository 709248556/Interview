package August_13.Singleton;

/**
 * @author yanlianglong
 * @Title: LazySingletonInternal.java
 * @Package August_13.Singleton
 * @Description:
 * @date 2019/8/13 16:39
 */
//静态内部类单例模式
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
