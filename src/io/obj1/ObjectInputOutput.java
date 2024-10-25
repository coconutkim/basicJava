package io.obj1;

import java.io.*;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutput {
    public static void main(String[] args) throws Exception {

        //fos에 oos 보조스트림 연결
        FileOutputStream fos = new FileOutputStream("C:/temp_j/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //파일에 저장할 객체 생성
        Member m1 = new Member("hoshi", "sunyoung kwon");
        Product p1 = new Product("laptop", 15000);
        int[] arr1 = {1, 2, 3};

        //객체를 역직렬화해서 저장
        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush();
        oos.close();
        fos.close();
        //왜 fos는 flush를 실행하지 않는가?
        //oos는 내부적으로 버퍼 사용
        //따라서 데이터 완전 출력을 위해 버퍼를 비우기 위한 작업 필요

        //파일을 읽어오는 작업 실행
        FileInputStream fis = new FileInputStream("C:/temp_j/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //파일을 읽고 역직렬화해서 객체로 복원
        Member m2 = (Member) ois.readObject(); //데이터를 읽어서 가져온다
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();
        //readobject() 메소드의 리턴 타입은 object
        //구체적인 타입으로 강제 타입 변환이 필요하다

        ois.close();
        fis.close();
        //왜 저장한 파일을 읽어올 때는 flush 작업이 필요없는가?
        //flush는 쓰기 작업에만 사용된다
        //파일에서 데이터를 읽는 과정에서는 버퍼를 사용하지 않는다
        //즉 버퍼에 남아 있는 데이터를 처리하는 과정이 없다

        System.out.println(m2);
        System.out.println(p2);
//        System.out.println(arr2); //번지만 확인이 된다
        System.out.println(Arrays.toString(arr2)); //배열의 내용을 문자열로 반환한다
    }
}
