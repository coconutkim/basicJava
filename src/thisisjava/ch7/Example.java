package thisisjava.ch7;

//action 메소드를 호출할 때 매개값이 c 객체일 경우에만 method2가 호출되도록 한다

public class Example {

    static class A{
        public void method1(){
            System.out.println("a-method");
        }
    }

    static class B extends A{
        public void method1(){
            System.out.println("b-method");
        }
    }

    static class C extends A{
        public void method1(){
            System.out.println("c-method");
        }
        public void method2(){
            System.out.println("c-method2");
        }
    }

    public static void action(A a){
        a.method1();
//        매개값이 c 객체일 경우에만
        if(a instanceof C c){

//            object instanceof ClassName
//            object는 검사할 객체
//            classname은 확인하려는 클래스나 인터페이스

                    c.method2();
        }
    }

    public static void main(String[] args){
        action(new A());
        action(new B());
        action(new C());
    }
}
