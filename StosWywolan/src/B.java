public class B extends A{

    public static void Foo1(){
        System.out.println("B Foo1");
    }

    public static void staticMindBreaker(){
        System.out.println("B staticMindBreaker");

        //A a = new A();
        A b = new B();
    }

    public void mindBreaker(){
        System.out.println("B mindBreaker");

        //A a = new A();
        A b = new B();
    }

    static {
        System.out.println("B Static block init");
    }

    {
        System.out.println("B block init");
    }

    public B(){
        System.out.println("B Constr");
    }

    public void doSth(){
        System.out.println("B doSth()");
    }
}
