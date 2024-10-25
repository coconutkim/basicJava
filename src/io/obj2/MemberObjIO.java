package io.obj2;

import java.io.*;
import java.util.Vector;

public class MemberObjIO {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Member m = null;
        Vector<Member> v = new Vector<Member>();
//        File vfile = new File("C:/temp_j/list.txt");
        //타입을 정의하지 않으면 모든걸 받을 수 있게 된다
        File dir = new File("C:/temp_j");
        File vfile = new File(dir, "list.txt");

        //파일의 존재 여부를 확인한다
        if (vfile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(vfile)
                    )
            );
            //물건을 가져오면 상자 안에 넣어둬야 한다
            v = (Vector<Member>) ois.readObject();
            ois.close();
        }

        while (true) {
            System.out.print("1. enrollment / 2. print / 3. close = ");
            int x = System.in.read() - 48; //아스키 코드 값을 읽는다
            System.in.read();
//            System.in.read();
//            System.out.println(x);
            //1 >> 49-48 = 1
            //2 >> 50-48 = 2

            if (x == 1) {
                //인스턴스를 리스트에 추가
                m = new Member();
                v.add(m); // >> 파일 입출력에 저장
                System.out.println();
            }

            if (x == 2) {
                Member mem = null;
//                m.display();
//                System.out.println(m);
                //v 안에 있는 것들을 전부 출력해라
                for (int i = 0; i < v.size(); i++) {
//                    mem = v.get(i);
                    mem = v.elementAt(i);
//                    v.get(i); 앞에 (Member)라고 표시를 해야 한다
//                    그런데 이전에 필드 선언시 그 내용을 넣어서 생략한다
//                    mem.display();
                    System.out.println(mem);
                }
                System.out.println();
            }

            if (x == 3) {
                //파일에 인스턴스를 저장
//                우선 파일을 만들고 거기에 2번의 값들을 저장한다
                ObjectOutputStream oos = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(vfile)
                        )
                );
                oos.writeObject(v);
                oos.close();

                System.out.println("the end");
                System.exit(0);
            }
        }
    }
}
