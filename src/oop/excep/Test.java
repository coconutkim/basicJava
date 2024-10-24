package oop.excep;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        int num = 0;
        String input = null;
        FileInputStream fis = null;

//        정수 아니면 참으로 계속 돌기
//        정수면 거짓으로 멈추고 계산식으로 계산하기

        do {
            try {
                System.out.println("input: ");
                input = sc.nextLine();

                if (input.equalsIgnoreCase("cute siro")) {
                    throw new MyException("end the program");
                }

                num = Integer.parseInt(input);
                int res = num * 10;
                System.out.println("result: " + res);
                flag = false;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                flag = true;

            } catch (MyException e) {
                System.out.println(e.getMessage());
                break;
            }

        } while (flag);
    }
}

//귀요미 시로 나오면 종료하기