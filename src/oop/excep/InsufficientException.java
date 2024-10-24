package oop.excep;

public class InsufficientException extends Exception {
    public InsufficientException() {

    }

//    매개변수가 없는 생성자:
//    InsufficientException을 발생시킬 때 구체적인 메시지를 전달할 필요가 없거나,
//    나중에 다른 방식으로 메시지를 설정하려는 경우에 사용됩니다.
//    예외를 던질 때 굳이 메시지를 제공하지 않아도 된다면,
//    기본 생성자를 사용하여 단순히 예외를 발생시킬 수 있습니다.

    public InsufficientException(String ms){
        super(ms);
    }
}
