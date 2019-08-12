package August_12;

/**
 * @author yanlianglong
 * @Title: Test.java
 * @Package August_12
 * @Description:
 * @date 2019/8/12 10:06
 */
public class Test {
    public static void main(String args[]) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
    /*A、输出：0000
    B、输出：123
    C、编译报错
    D、输出：No name*/
}

//子类初始化的时候会先调用父类的初始化方法，
// 由于父类没有默认无参数的构造方法所以就会报错了，
// super("")子类构造方法中手动写明调用父类的构造方法参数为空字符串
