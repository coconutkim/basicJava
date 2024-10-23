package oop.inner;

public class A {

    class B{
        int field1 = 1;
        static int field2 = 2;

        B(){
            System.out.println("execute b-constructor");
        }

        void method1(){
            System.out.println("execute b-method1");
        }

        static void method2(){
            System.out.println("execute b-method2");
        }
    }

//    method
    void useB(){
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();

//        1과 2의 접근 방식이 다른 이유
//        1은 인스턴스로 객체를 통해 접근
//        2는 static으로 클래스를 통해 접근
//        즉 static 멤버는 객체에 속하지 않으며 여전히 클래스의 것
    }
}
