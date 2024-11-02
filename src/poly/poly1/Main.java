package poly.poly1;

public class Main {

    public static void main(String[] args){

        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.tire.roll();

        myCar.tire = new KumhoTire();
        myCar.tire.roll();

//        HankookTire ht = new HankookTire();
//        Car myCar2 = new Car(ht);
//        myCar2.tire.roll();
    }
}
