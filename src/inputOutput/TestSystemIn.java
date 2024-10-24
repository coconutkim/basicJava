package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSystemIn {
    public static void main(String[] args) throws IOException {
        System.out.print("input contents: ");
//        System.out.println((char) System.in. read());
        //키보드에서 입력을 하면 아스키 코드값이 있다

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
    }
}

//System.in.read(); //기본적으로 아스키 코드 출력