package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteTest3 {
        public static void main(String[] args){
            try{
                Writer writer = new FileWriter("G:\\내 드라이브\\temp\\test3.txt");

                //1 문자씩 출력
                char a = 'A';
                writer.write(a);
                char b = 'B';
                writer.write(b);

                //char 배열 출력
                char[] arr = {'C','D','E'};
                writer.write(arr);

                //문자열 출력
                writer.write("FGH");

                writer.flush();
                writer.close();
                //위 두 과정을 거쳐야 파일에 텍스트가 보인다
                System.out.println("well done");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
