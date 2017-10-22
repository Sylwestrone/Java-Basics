public class A {

    public static void Foo1(){
        System.out.println("A Foo1");
    }

    public static void staticMindBreaker(){
        System.out.println("A staticMindBreaker");
        //A a = new A(); // latwa wersja dla frajerow
        B b = new B(); // ciut ciekawsza :)

    }

    public void mindBreaker(){
        System.out.println("A mindBreaker");

        A a = new A();
    }

    static {
        System.out.println("A Static block init");
    }

    {
        System.out.println("A block init");
    }

    public A(){
        System.out.println("A Constr");
    }

    public void doSth(){
        System.out.println("A doSth()");
    }
}


