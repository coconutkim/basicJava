package lambda.exam1;

public class LambdaTest2 {
    public static void main(String[] args){
        Person p = new Person();

        //실행문이 2개 이상인 경우 중괄호가 필요하다
        p.action(() -> {
            System.out.println("go to work");
            System.out.println("do programming");
        });

        //실행문이 1개일 경우 중괄호를 생략해도 된다
        p.action(() -> System.out.println("leave work"));
    }
}
