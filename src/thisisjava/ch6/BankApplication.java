package thisisjava.ch6;

import java.util.Scanner;

public class BankApplication {
//    키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램
//    계좌는 account 객체로 생성
//    bankapplication에서 길이 100인 account[] 배열로 관리됨
//    키보드로 입력받을 때는 scanner의 nextline 메소드를 사용

    public static Account2[] accountArr = new Account2[100];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean run = true;
        while (run){
            System.out.println("==============================");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("==============================");
            System.out.println("your choice> ");

            int selectNum = Integer.parseInt((scanner.nextLine()));
            if(selectNum == 1){
                createAccount();
            }

            else if(selectNum == 2){
                accountList();
            }

            else if(selectNum == 3){
                deposit();
            }

            else if(selectNum == 4){
                withdraw();
            }

            else if(selectNum == 5){
                run = false;
            }
        }
        System.out.println("ending the program");
    }

    // 1. 계좌 생성
    private static void createAccount(){
        System.out.println();
        System.out.println("계좌 생성");
        System.out.println();

        System.out.print("account number: ");
        String ano = scanner.nextLine();

        System.out.print("account owner: ");
        String owner = scanner.nextLine();

        System.out.print("the initial deposit amount: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account2 newAccount = new Account2(ano, owner, balance);
        for(int i=0;i<accountArr.length;i++){
            if(accountArr[i] == null){
                accountArr[i] = newAccount;
                System.out.println("completed!");
                break;
            }
        }
    }

    // 2. 계좌 목록
    private static void accountList(){
        System.out.println();
        System.out.println("account list");
        System.out.println();

        for(int i=0;i<accountArr.length;i++){
            Account2 account2 = accountArr[i];
            if(account2 != null){
                System.out.print(account2.getAno());
                System.out.print("        ");
                System.out.print(account2.getOwner());
                System.out.print("        ");
                System.out.print(account2.getBalance());
                System.out.println();
            }
        }
    }

    // 3. 예금
    private static void deposit(){
        System.out.println();
        System.out.println("deposit");
        System.out.println();
        System.out.print("account number: ");
        String ano = scanner.nextLine();
        System.out.print("savings: ");
        int money = Integer.parseInt(scanner.nextLine());
        Account2 account2 = findAccount(ano);
        if(account2 == null){
            System.out.println("there's no account");
            return;
        }
        account2.setBalance(account2.getBalance()+money);
        System.out.println("completed!");
    }

    // 4. 출금
    private static void withdraw(){
        System.out.println();
        System.out.println("withdraw");
        System.out.println();
        System.out.print("account number: ");
        String ano = scanner.nextLine();
        System.out.print("amount to withdraw: ");
        int money = Integer.parseInt(scanner.nextLine());
        Account2 account2 = findAccount(ano);
        if(account2 == null){
            System.out.println("there's no account");
            return;
        }
        account2.setBalance(account2.getBalance()-money);
        System.out.println("completed!");
    }

    // 동일한 account 찾기
    private static Account2 findAccount(String ano){
        Account2 account2 = null;
        for(int i=0;i<accountArr.length;i++){
            if(accountArr[i] != null){
                String dbAno = accountArr[i].getAno();
                if(dbAno.equals(ano)){
                    account2 = accountArr[i];
                    break;
                }
            }
        }
        return  account2;
    }
}
