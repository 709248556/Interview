package August_24;

public class OuterClass {
    private String name ;
    private int age;

    private static String _name ;
    private static int _age;

    public String getName() {
        return name;
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

    class InnerClass{
        int i ;
//        static int j = 1;
        final static int j = 2;
        public InnerClass(){
            name = "InnerClass";
            age = 23;
        }
    }
    static class _InnerClass{
        public _InnerClass(){
            _name = "chenssy";
            _age = 23;
        }
    }
}