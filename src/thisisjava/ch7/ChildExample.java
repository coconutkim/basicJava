package thisisjava.ch7;

public class ChildExample {
    public static void main(String[] args){
        Child child = new Child();
    }
}

//문제
//childexample 클래스를 실행했을 때
//호출되는 각 클래스의 생성자의 순서를 생각하면서
//출력 결과를 작성해보세요

//출력 결과
//Parent(String nation) call
//Parent() call
//Child(String name) call
//Child() call