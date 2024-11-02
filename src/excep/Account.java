package excep;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException{
                                    //예외가 있다는 것을 알림
        if(balance<money){
            throw new InsufficientException("lack of balance: "+(money - balance)+" is insufficient");
        }
        balance += money;
    }
}

