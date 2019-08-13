package August_13.Singleton;

/**
 * @author yanlianglong
 * @Title: HungerSingleton.java
 * @Package August_13.Singleton
 * @Description:
 * @date 2019/8/13 16:12
 */

//饿汉模式是最简单的实现方式，在类加载的时候就创建了羊例类的对象
public class HungerSingleton {
    private static final HungerSingleton instance = new HungerSingleton();
    //单例类的构造方法都是私有的，防止外部创建单例类的对象
    private HungerSingleton() {}
    public static HungerSingleton newInstance () {
        return instance; //返回唯一的单例对象
    }
}
