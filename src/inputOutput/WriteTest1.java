package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteTest1 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("G:/내 드라이브/temp/test1.txt");

            byte a = 10;
            byte b = 20;

            try {
                os.write(a);
                os.write(b);

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
