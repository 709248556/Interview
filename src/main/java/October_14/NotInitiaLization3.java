package October_14;

public class NotInitiaLization3 {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}
/*
 * 常量在编译阶段会存入调用类的常量池，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的初始化
 */
