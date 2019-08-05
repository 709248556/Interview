package August_05.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author yanlianglong
 * @Title: sort.java
 * @Package August_05.java8
 * @Description:
 * @date 2019/8/5 13:17
 */
public class sort {
    public static void main(String[] args) {
        List<User> list = initList();

//        // jdk8 lambda排序，带参数类型
//        list = initList();
//        list.sort((User u1, User u2) -> u1.getAge().compareTo(u2.getAge()));
//        list.forEach(System.out::println);
//
//        System.out.println();
//
//        // jdk8 lambda排序，不带参数类型
//        list = initList();
//        list.sort((u1, u2) -> u1.getAge().compareTo(u2.getAge()));
//        list.forEach(System.out::println);
//
//        System.out.println();
//
//        // jdk8 排序，User类静态方法引用
//        list = initList();
//        list.sort(User::compareAge);
//        list.forEach(System.out::println);
//
//        System.out.println();

        // jdk8 升序排序，Comparator提供的静态方法
        list = initList();
        Collections.sort(list, Comparator.comparing(User::getAge));
        list.forEach(System.out::println);

        System.out.println();

        // jdk8 降序排序，Comparator提供的静态方法
        list = initList();
        Collections.sort(list, Comparator.comparing(User::getAge).reversed());
        list.forEach(System.out::println);

        System.out.println();

        // jdk8 组合排序，Comparator提供的静态方法，先按年纪排序，年纪相同的按名称排序
        list = initList();
        Collections.sort(list, Comparator.comparing(User::getAge).thenComparing(User::getName));
        list.forEach(System.out::println);
    }

    private static List<User> initList() {
        List<User> list = new ArrayList<User>();
        list.add(new User("lisa", 23));
        list.add(new User("tom", 11));
        list.add(new User("john", 16));
        list.add(new User("jennis", 26));
        list.add(new User("tin", 26));
        list.add(new User("army", 26));
        list.add(new User("mack", 19));
        list.add(new User("jobs", 65));
        return list;
    }
}
