package thisisjava.ch6;

public class Account2 {
//    키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램
//    계좌는 account 객체로 생성
//    bankapplication에서 길이 100인 account[] 배열로 관리됨
//    키보드로 입력받을 때는 scanner의 nextline 메소드를 사용

//    Account2 account2 = new Account2();
    private String ano;
    private String owner;
    private int balance;

    public Account2(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

        public String getAno(){
            return ano;
        }
        public void setAno(String ano){
            this.ano = ano;
        }

        public String getOwner(){
            return owner;
        }
        public void setOwner(String owner){
            this.owner = owner;
        }

        public int getBalance(){
            return balance;
        }
        public void setBalance(int balance){
            this.balance = balance;
        }
}
