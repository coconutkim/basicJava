package io.obj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Member implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    //transient를 통해 객체 정보 저장에 포함되지 않는다
    //직렬화 하지 않아도 됨, 복원 필요없음
    private static transient BufferedReader in;

    static {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    public Member() throws IOException{
        System.out.print("id: ");
        //빠른 처리를 위해 scanner보다 bufferedreader를 활용
        id = in.readLine();
        System.out.print("name: ");
        name= in.readLine();
    }//여기까지가 입력

//    public Member(String id, String name){
//        this.id = id;
//        this.name = name;
//    }

    public void display(){
        System.out.print(id+"\t");
        System.out.print(name+"\t");
    }

    @Override
    public String toString(){return id+": "+name;}
}
