package io.obj2;

import java.io.*;

public class ScoreWriteRead {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        int count = 1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = ""; // 입력값이 숫자가 아닌 경우를 방지하기 위해 사용
        String scoreData = "";
        File f = new File("src/io/obj2/scoreData.txt");
        PrintWriter output = new PrintWriter(f);

        do {
            System.out.println("Please input No." + count + " score");
            //점수 입력
            str = in.readLine();
            // 입력값이 숫자인지 확인
            if (isRealNum(str)) {
                //만약에 10번째가 아니면
                if (count != 10) {
                    //아래의 형식으로 데이터를 저장한다
                    scoreData += str + ", ";
                } else {//콤마는 없되 10번째 데이터는 필요하다
                    scoreData += str;
                }
                count++; //하나씩 세어나간다
            } else {
                System.out.println("Invalid input. Please enter a number");
            }
        } while (count <= 10); // count가 10이 될 때까지 반복

        output.println(scoreData);
        in.close();
        output.close(); //실행한 것을 닫아줘야 파일에 저장이 되어 나타난다
        System.out.println("ouput of score");
//        System.out.println(scoreData);

        System.out.println();

        //////////////////////////////////////////////파일 읽어오기
        String filepath = "src/io/obj2/scoreData.txt";
        BufferedReader br = new BufferedReader(new FileReader(filepath));

        String line;

        line = br.readLine(); //한 줄씩 읽는다

        System.out.println(line);

        System.out.println();

        /////////////연산 수행
        // 문자열을 콤마를 기준으로 분리
        String[] numbers = line.split(", ");

        int sum = 0;
        //총 입력된 숫자의 개수를 센다
        int count_line = numbers.length;

        // 각 숫자를 정수로 변환하여 합계 계산
        for (String num : numbers) {
            //numbers라는 리스트의 각 요소를 num이라는 변수에 담는다
            sum += Integer.parseInt(num);
        }

        // 평균 계산
        double average = (double) sum / count_line;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }

    // 숫자인지 확인하는 메소드
    public static boolean isRealNum(String str){
        try {
            int num = Integer.parseInt(str);
            if(num <0 || num > 100){
                throw new RangeException("out of range");
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }catch (RangeException e){
            return false;
        }
    }
}

//다음 과제
//파일을 읽어와서 총합, 평균 등과 같은 연산 수행
