package load.order;

public class Main {
    public static void main(String[] args) {
        Child.executeStaticMethod();
        System.out.println("==========Child的静态方法已经执行==========");
        Child b = new Child();
        System.out.println("==========第一个Child已实例化完成==========");
        Child b1 = new Child();
        System.out.println("==========第二个Child已实例化完成==========");
    }
}
