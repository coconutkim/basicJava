package excep;

public class AccountTest {
    public static void main(String[] args){

        Account ac = new Account();

        ac.deposit(1000);
        System.out.println("deposit: "+ac.getBalance());

        try{
            ac.withdraw(30000);
        }catch(InsufficientException e){
            String ms = e.getMessage();
            System.out.println(ms);
        }
    }
}
