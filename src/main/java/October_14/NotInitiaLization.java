package October_14;

public class NotInitiaLization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
/*
 * 对于静态字段，只有直接定义这个字段的类才会被初始化，
 * 至于是否初始化子类，要看虚拟机的具体实现
 */