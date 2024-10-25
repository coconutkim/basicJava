package io.obj1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws Exception {

        //파일 객체 생성
        File dir = new File("C:/temp_j/images");
        File f1 = new File("C:/temp_j/f1.txt");
        File f2 = new File("C:/temp_j/f2.txt");
        File f3 = new File("C:/temp_j/f3.txt");

        if (dir.exists() == false) {
            dir.mkdir();
        }
        if (f1.exists() == false) {
            f1.createNewFile();
        }
        if (f2.exists() == false) {
            f2.createNewFile();
        }
        if (f3.exists() == false) {
            f3.createNewFile();
        }

        //폴더의 내용 출력
        File temp = new File("C:/temp_j");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
//            날짜 출력 포맷
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
//            @NotNull   String format, Object... args
            //생성자 함수 안에 어떤 날짜 정보를 이용할지 적는다
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
//            System.out.println(contents); //형식이 필요하다
            System.out.println();
        }
    }
}

//%: 형식 지정자의 시작을 나타냅니다.
//-: 왼쪽 정렬을 의미합니다. 이 기호가 없으면 기본적으로 오른쪽 정렬됩니다.
//10 또는 20: 출력할 문자열의 최소 너비를 지정합니다.
//    예를 들어, %-10s는 최소 10자리를 차지하도록 왼쪽 정렬된 문자열을 출력합니다.
//    %-20s는 최소 20자리를 차지하도록 왼쪽 정렬된 문자열을 출력합니다.
//s: 문자열을 나타냅니다.
