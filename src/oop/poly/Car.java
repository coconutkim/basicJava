package oop.poly;

public class Car {

    public Tire tire;

    public void run(){
        tire.roll();
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
