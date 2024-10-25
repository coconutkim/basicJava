package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadTest2 {
    public static void main(String[] args){
        try {
            InputStream is = new FileInputStream("G:/내 드라이브/temp/test.db");

            byte[] data = new byte[100]; //비어있는 배열

            while (true) {
                int num = is.read(data); //읽어온 데이터를 배열에 담기 위함
                if(num == -1) break; //파일 끝에 도달했을 경우

                for(int i=0;i<num;i++){
                    System.out.println(data[i]); //읽은 바이트를 출력
                }
            }
            is.close(); //파일 읽기가 끝난 후 사용한 입력 스트림 닫기

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
