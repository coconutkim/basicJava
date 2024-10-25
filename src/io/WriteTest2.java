package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteTest2 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("G:/내 드라이브/temp/test2.txt");

            byte[] arr = {10, 20, 30, 40, 50, 60};

            try {
                os.write(arr); //화면에 보이지 않고 파일로 저장된다
//                os.write(arr, 0, 4); // 0번 인덱스부터 3개까지만 출력
                os.flush();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
