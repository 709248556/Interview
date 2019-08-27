package August_27;

/**
 * @author yanlianglong
 * @Title: Inc.java
 * @Package August_27
 * @Description:
 * @date 2019/8/27 10:02
 */
public class Inc {
    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);

    }

    void fermin(int i) {
        i++;
    }
}
/*
A、0
B、1
C、2
D、3
 */
