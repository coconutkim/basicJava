package oop.inner;

public class A2 {

    static class B{
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
}
