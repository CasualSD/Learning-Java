package _2_classes._2_inheritance.exercise2;

public class Application {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        //System.out.println("Output of a.foo(4.0): ");
        // a.foo(4.0); //ERROR 

        System.out.println("Output of a.foo(4): ");
        a.foo(4);

        System.out.println("\n\rOutput of b.foo(3.6): ");
        b.foo(3.6);

        System.out.println("\n\rOutput of b.foo(4, 4): ");
        b.foo(4,4);
    }
}
