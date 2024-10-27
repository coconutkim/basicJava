package oop.abst;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }

    public static void animalSound(oop.abst.Dog animal) {
        animal.sound();
    }
}
