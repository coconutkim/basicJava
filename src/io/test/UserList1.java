package io.test;

import java.io.*;

public class UserList1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
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

        String text1 = u1.getUserInfo()+"\n";
        String text2 = u2.getUserInfo()+"\n";
        String text3 = u3.getUserInfo();

        FileOutputStream fos = new FileOutputStream(new File("src/io/test/userlist1.txt"));

        byte[] t1 = text1.getBytes();
        fos.write(t1);
        byte[] t2 = text2.getBytes();
        fos.write(t2);
        byte[] t3 = text3.getBytes();
        fos.write(t3);

        fos.flush();
        fos.close();

        ///////////////////////////////////////////////////////////////

        byte[] b = new byte[t1.length+t2.length+t3.length];
        FileInputStream fis = new FileInputStream("src/io/test/userlist1.txt");

        fis.read(b);
        System.out.println(new String(b));
        fis.close();
    }
}
