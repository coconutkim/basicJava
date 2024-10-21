package thisisjava.ch7;

public class Child extends Parent{
    public int studentNo;

    public Child(String name, int studentNo){
//        this.name = name;
        super(name);
        this.studentNo = studentNo;
    }
}

//내 풀이
//super로 생성자 상속을 하지 않아서

//정답
//부모 생성자를 올바르게 호출하지 않았다
//this.name = name; >> super(name);
