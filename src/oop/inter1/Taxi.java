package oop.inter1;

public class Taxi implements Vehicle{

    @Override
    public void run(){
        System.out.println("taxi is running");
    }

    public void checkFare(int min){
        System.out.println("fare of taxi");
        // 기본 요금에 분당 얼마다
    }
}
