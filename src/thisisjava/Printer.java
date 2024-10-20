package thisisjava;

public class Printer {
//    println(): 매개값을 콘솔에 출력
//    매개값으로 int, boolean, double, string 타입 값을 준다
//    printer 클래스에서 println 메소드를 오버로딩하여 선언

    public void println(int value){
        System.out.println(value);
    }

    public void println(boolean value){
        System.out.println(value);
    }

    public void println(double value){
        System.out.println(value);
    }

    public void println(String value){
        System.out.println(value);
    }

//    프린터 객체를 생성하지 않고도
//    다음을 호출할 수 있도록 프린터 클래스 수정

//    Printer.println(10);
//    Printer.println(true);
//    Printer.println(5.7);
//    Printer.println("홍길동");


}
