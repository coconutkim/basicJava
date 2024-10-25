package io.obj2;

import java.io.*;

public class Score {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        int count = 1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = ""; // 입력값이 숫자가 아닌 경우를 방지하기 위해 사용
        String scoreData = "";
        File f = new File("C:/temp_j/scoreData.txt");
        PrintWriter output = new PrintWriter(f);

        do {
            System.out.println("Please input No." + count + " score");
            str = in.readLine();
            // 입력값이 숫자인지 확인
            if (isRealNum(str)) {
                if (count != 10){
                    scoreData += str+", ";
                }else{//콤마는 없되 10번째 데이터는 필요하다
                    scoreData += str;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please enter a number");
            }
        } while (count <= 10); // count가 10이 될 때까지 반복
        output.println(scoreData);
        in.close();
        output.close(); //실행한 것을 닫아줘야 파일에 저장이 되어 나타난다
        System.out.println("ouput of score");
//        System.out.println(scoreData);
    }

    // 숫자인지 확인하는 메소드
    public static boolean isRealNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

//다음 과제
//파일을 읽어와서 총합, 평균 등과 같은 연산 수행
