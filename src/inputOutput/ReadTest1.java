package inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadTest1 {
    public static void main(String[] args){
        try {
            InputStream is = new FileInputStream("G:/내 드라이브/temp/test1.txt");
            while (true){
                int data = is.read(); //파일 읽기
                if(data == -1) break;
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
