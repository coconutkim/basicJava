package io;

import java.io.*;

public class CopyTest1 {
    public static void main(String[] args){
        //입출력부터 코드를 작성해서 만든다
        try {
            InputStream is = new FileInputStream("G:/내 드라이브/temp/hoshi.jpg");
            OutputStream os = new FileOutputStream("G:/내 드라이브/temp/hoshi3.jpg");

            //원본 이미지 파일 읽기
            //파일을 읽기 전에 이미지를 한번에 읽을 수 있는 크기를 정한다
//            byte[] data = new byte[1024];
//            while (true){
//                int num = is.read(data);
//                if(num == -1) break;
//                os.write(data, 0, num); //첫번째부터 마지막까지
//            }

            //위의 코드를 한 줄로 대체
            is.transferTo(os); //자바 9부터 추가된 입력 스트림에서 출력 스트림으로 바이트를 복사
            os.flush();
            os.close();
            is.close();

            System.out.println("well done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

