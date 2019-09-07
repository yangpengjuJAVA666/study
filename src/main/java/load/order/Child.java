package load.order;

public class Child extends Father {

    int age = f3();

    int f3() {
        System.out.println("Child成员变量加载");
        return 4;
    }

    static int id = f4();

    static int f4() {
        System.out.println("Child静态成员变量加载");
        return 6;
    }

    public Child() {
        System.out.println("Child构造函数加载");
    }

    {
        System.out.println("Child方法块加载");
    }

    static {
        System.out.println("Child静态方法块加载");
    }

    // 执行Child的静态方法，会将A的静态成员变量加载，静态方法块加载，B的静态成员变量加载，静态方法块加载，然后执行B的静态方法。
    public static void executeStaticMethod() {
        System.out.println("Child静态方法☆☆☆执行☆☆☆");
    }
}