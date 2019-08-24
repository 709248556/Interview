package August_24;

public class Break {
    public static void flag() {
        System.out.println("MainClass1 Start...");
        ko:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5)
                    break ko;
            }
        }
        System.out.println("MainClass1 End.");
    }
    public static void _break() {
        System.out.println("MainClass1 Start...");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5)
                    break;
            }
        }
        System.out.println("MainClass1 End.");
    }

    public static void main(String[] args) {
        flag();
        _break();
    }
}
