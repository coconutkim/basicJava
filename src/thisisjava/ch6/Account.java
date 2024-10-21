package thisisjava.ch6;

public class Account {
//    balance 필드를 가진다
//    음수값이 될 수 없다
//    최대 백만 원까지만 저장 가능하다
//    외부에서 필드를 마음대로 변경하지 못한다
//
//    setter and getter를 이용한다
//    min_balance, max_balnce 상수를 선언해서 이용한다
//    setter의 매개값이 음수이거나 백만 원을 초과하면
//    현재 balance 값을 유지한다

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

//    static
//    클래스의 모든 인스턴스가 공유하는 변수
//    인스턴스를 생성하지 않고도 클래스 이름으로 접근할 수 있다
//
//    final
//    한 번 초기화되면 그 값을 변경할 수가 없다
//    상수로 취급되어 불변성을 가진다

    private int balance;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        if(balance<Account.MIN_BALANCE || balance>Account.MAX_BALANCE){
            return; // 조건에 맞을 경우 메서드를 종료하고 아무것도 하지 않는다
        }
        this.balance = balance;
        // 입력된 값이 유효할 경우 balance를 업데이트한다
    }
}
