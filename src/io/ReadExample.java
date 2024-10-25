package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {

        try {
            Reader reader = null;
            reader = new FileReader("G:/내 드라이브/temp/test3.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.println(data); //읽은 문자 출력
            }
            reader.close();

            System.out.println();

            reader = new FileReader("G:/내 드라이브/temp/test3.txt");
            //파일을 읽음, 즉 이 파일이 미리 존재해야 함
            //존재하지 않을 시 filenotfoundexception이 발생
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]); //읽은 수만큼 출력한다
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
