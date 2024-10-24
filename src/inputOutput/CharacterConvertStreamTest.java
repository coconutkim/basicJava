package inputOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CharacterConvertStreamTest {
    public static void main(String[] args) throws Exception {
        write("use char convert stream");
        String data = read();
        System.out.println(data);
    }

    private static void write(String str) {
        try {
            OutputStream os = null;
            try {
                os = new FileOutputStream("G:/내 드라이브/temp/test.txt");
                //파일 저장 경로
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            //파일 저장 형식
            writer.write(str);
            writer.flush();
            writer.close();

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("G:/내 드라이브/temp/test.txt");
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

        char[] data = new char[100];
        int num = reader.read(data);  //정수형을 반환한다
        //reader라는 객체에 있는 자료를 읽는다
        System.out.println((char) num); //정수형을 문자로 바꿈
        reader.close();
        String str = new String(data, 0, num); //문자열이 된다
        return str;
    }
}