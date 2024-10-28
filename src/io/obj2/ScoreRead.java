package io.obj2;

import java.io.*;
import java.util.StringTokenizer;

public class ScoreRead {
    public static void main(String[] args) throws IOException {
        File file = new File("src/io/obj2/scoreData.txt");
        String str = "";
        //null로 초기화할 경우 nullpointer 예외가 발생할 수 있다
        int totalScore = 0;
        int count = 0;
        float avg = 0.0f;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            str = br.readLine();
            if(str != null){ //만약에 파일 내용이 비어있지 않으면
                System.out.println("scores: "+str); //파일 내용이 있으면 이런 형식으로 출력해라
                //score: 65, 98, 51, 55, 22, 48, 74, 28, 96, 65
                //stringtokenizer를 통해 문자열을 쪼갠다
                StringTokenizer st = new StringTokenizer(str, ", ");

                while(st.hasMoreTokens()) {
                    totalScore += Integer.parseInt(st.nextToken());
                    count++;
                    avg = (float) totalScore / count;
                }
                System.out.println("sum = "+totalScore);
                System.out.println("the number of scores = "+count);
                System.out.println("average = "+avg);
            }else{
                System.out.println("file is empty"); //파일 내용이 없으면 이런 내용을 출력해라
            }
        }catch (FileNotFoundException e){ //파일이 존재하지 않을 경우라는 예외
            System.out.println("file not found");
        }
    }
}
