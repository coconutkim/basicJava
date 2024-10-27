package io.test;

import java.io.*;

public class UserList2 {
    public static void main(String[] args) throws Exception {

        User2 u1 = new User2("alice", 25, "111-1111-1111");
        User2 u2 = new User2("james", 65, "222-2222-2222");
        User2 u3 = new User2("watson", 12, "333-3333-3333");

        FileOutputStream fos = new FileOutputStream("src/io/test/userlist2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        String text1 = u1.getUserInfo()+"\n";
//        String text2 = u2.getUserInfo()+"\n";
//        String text3 = u3.getUserInfo();

        oos.writeObject(u1);
        oos.writeObject(u2);
        oos.writeObject(u3);

        System.out.println("save completed");

        oos.flush();
        oos.close();
        fos.close();

        System.out.println();

        FileInputStream fis = new FileInputStream("src/io/test/userlist2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        User2 us1 = (User2) ois.readObject();
        User2 us2 = (User2) ois.readObject();
        User2 us3 = (User2) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(us1);
        System.out.println(us2);
        System.out.println(us3);
    }
}