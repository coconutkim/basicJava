package oop.inner;

public class A1 {

    static class B{}

    B field1 = new B();

    static B field2 = new B();

    A1(){
        B b = new B();
    }

    void method1(){
    B b = new B();
    }

    static void method2(){
        B b = new B();
    }
}
