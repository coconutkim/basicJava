package lambda.exam3;

public class LambdaTest {
    public static void main(String[] args){
        Person person = new Person();

        person.action((x, y) -> {
            double result = x + y;
            return result;
        });


    }
}
