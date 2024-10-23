package oop.excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws NumberFormatException{
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.println("input integer for kor: ");
        int kor = sc.nextInt();

//        try()

        try {System.out.println("input integer: ");
            int math = Integer.parseInt(br.readLine());
        }catch(NumberFormatException e){
            System.out.println("exception1: "+e.getMessage());
//            e.printStackTrace();
        }catch(IOException e) {
            System.out.println("exception2: "+e.getMessage());
        }finally {//자동 수행
            System.out.println("execute finally");
        }
    }
}
