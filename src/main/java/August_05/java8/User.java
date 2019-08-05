package August_05.java8;

import java.util.Comparator;

/**
 * @author yanlianglong
 * @Title: User.java
 * @Package August_05.java8
 * @Description:
 * @date 2019/8/5 13:18
 */
public class User{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString()+",name:"+name+",age:"+age;
    }
}
