package inputOutput;

import java.io.*;

public class CopyTest {
    public static void main(String[] args){
        //입출력부터 코드를 작성해서 만든다
        try {
            InputStream is = new FileInputStream("G:/내 드라이브/temp/hoshi.jpg");
            OutputStream os = new FileOutputStream("G:/내 드라이브/temp/hoshi2.jpg");

            //원본 이미지 파일 읽기
            //파일을 읽기 전에 이미지를 한번에 읽을 수 있는 크기를 정한다
            byte[] data = new byte[1024];
            while (true){
                int num = is.read(data);
                if(num == -1) break;
                os.write(data, 0, num); //첫번째부터 마지막까지
            }

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
