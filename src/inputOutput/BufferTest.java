package inputOutput;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws Exception {

        System.out.println(System.getProperty("java.class.path"));

        String originalFilePath1 =
                BufferTest.class.getResource("tiger.jpg").getPath();
        String targetFilePath1 = "C:/intellij/tiger_os.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        String originalFilePath2 =
                BufferTest.class.getResource("tiger2.jpg").getPath();
        String targetFilePath2 = "C:/intellij/tiger2_os.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("non buffer:\t" + nonBufferTime);

        long bufferTime = copy(fis2, fos2);
        System.out.println("buffer:\t" + bufferTime);

        fis.close();
        fos.close();
        fis2.close();
        fos2.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }

        os.flush();

        long end = System.nanoTime();

        return (end - start);
    }
}

//메서드에서 예외가 발생하면 가장 가까운 try catch 문을 찾는다
//없으면 계속 상위 메서드로 전달된다
//결국 main까지 가고 여기서도 처리되지 않으면 jvm이 프로그램을 종료한다

