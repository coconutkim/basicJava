package abst.abst1;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }

    public static void animalSound(abst.abst1.Dog animal) {
        animal.sound();
    }
}
