package October_14;

public class NotInitiaLization2 {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}
/*
 * 通过数组定义来引用类，不会触发此类的初始化
 */