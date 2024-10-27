package io.test;

import java.io.*;

public class UserList1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //사용자 객체 생성
        User1 u1 = new User1("alice", 25, "111-1111-1111");
        User1 u2 = new User1("james", 65, "222-2222-2222");
        User1 u3 = new User1("watson", 12, "333-3333-3333");

//        System.out.println(u1.getUserInfo());
//        System.out.println(u2.getUserInfo());
//        System.out.println(u3.getUserInfo());

//        FileWriter fw = new FileWriter("C:/intellij_test/userlist1.txt");
//
//        fw.write(u1.getUserInfo());
//        fw.write(u2.getUserInfo());
//        fw.write(u3.getUserInfo());
//
//        fw.close();

        //각 사용자의 정보를 문자열로 생성
        String text1 = u1.getUserInfo()+"\n";
        String text2 = u2.getUserInfo()+"\n";
        String text3 = u3.getUserInfo();

        FileOutputStream fos = new FileOutputStream(new File("src/io/test/userlist1.txt"));

        //문자열을 바이트 배열로 변환
        //바이트 배열이란 컴퓨터가 이해할 수 있는 이진 형태의 데이터
        //변환 후 파일에 저장하여 프로그램 종료 후에도 데이터를 보존
        byte[] t1 = text1.getBytes();
        fos.write(t1);
        byte[] t2 = text2.getBytes();
        fos.write(t2);
        byte[] t3 = text3.getBytes();
        fos.write(t3);

        fos.flush();
        fos.close();

        ///////////////////////////////////////////////////////////////
        //바이트 단위로 수동 변환
        byte[] b = new byte[t1.length+t2.length+t3.length];
        FileInputStream fis = new FileInputStream("src/io/test/userlist1.txt");

        fis.read(b);
        System.out.println(new String(b));
        fis.close();
    }
}
