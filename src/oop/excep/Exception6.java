package oop.excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception6 {
    public static void main(String[] args){

//        int num1 = 100, num2 = 0;
//        int res = num1 / num2;
//        System.out.println("result: "+res);
        //분모가 0일 경우 arithmetic 예외가 발생

        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, res = 0;
        boolean flag = false;

        //get x value input
        do {
            try {
                System.out.println("x = ");
                x = sc.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("only accept integer");
                flag = true;
                sc.nextLine();
            } //정수가 아니면 예외 발생
        }while(flag); //if data is string >> true
        //if data is integer >> false
        //if true only, infinite repetition

//        System.out.println("x is "+x);

        //get y value input
        do {
            try {
                System.out.println("y = ");
                y = sc.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("only accept integer");
                flag = true;
                sc.nextLine();
            } //정수가 아니면 예외 발생
        }while(flag);

        //check whether y value is zero
        do {
            try{
                res = x/y;
                flag = false;
            }catch (ArithmeticException e){
                System.out.println("don't input zero in the denominator");
                flag = true;
                sc.nextLine();
                System.out.println("y = ");
                y = sc.nextInt();
            }
        }while(flag);

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println(x+" / "+y+" = "+res);
    }
}

//문자열이 들어오면 다시 입력받기
//정상값이 들어오면 계산 실행
//분모가 0이면 예외 발생시키기

//엔터를 해야 종료된다
//문자열+엔터를 같이 받아야 다음으로 넘어간다 >> nextline
//문자만 받으면 >> next