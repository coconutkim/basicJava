package inner;

public class ATest2 {
    public static void main(String[] args){

        A2.B b = new A2.B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(A2.B.field2);
        A2.B.method2();
    }
}
