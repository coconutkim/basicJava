package lambda.exam3;

public class Person {
    public void action(Calculable calculable){
//        double calc(double x,double y);
        double result = calculable.calc(10,4); //실제 값을 전달
        System.out.println("result: "+result);
    }
}
