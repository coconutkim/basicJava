package lambda.exam2;

public class LambdaTest {
    public static void main(String[] args){
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.print(name+" is doing ");
            System.out.println(job);
        });

        person.action1((name, job) -> System.out.println(name+" doesn't like "+job));

        System.out.println();

        person.action2(content -> System.out.println(content));
    }
}
