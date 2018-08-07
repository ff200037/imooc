public class Test2 {
    public static void main(String[] args) {
        System.out.println();
        Test1 test = new Test1();
        System.out.println(test.toString());
        fn1("aa", 1, 1);
    }

    private static void fn1(String name, int age, int sex) {
        System.out.println(name);
    }
}
