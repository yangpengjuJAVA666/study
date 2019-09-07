package load.order;

public class Father {

    int age = f1();

    int f1() {
        System.out.println("Father成员变量加载");
        return 4;
    }

    static int id = f2();

    static int f2() {
        System.out.println("Father静态成员变量加载");
        return 6;
    }

    public Father() {
        System.out.println("Father构造函数加载");
    }

    {
        System.out.println("Father方法块加载");
    }

    static {
        System.out.println("Father静态方法块加载");
    }

}
