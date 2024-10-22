package thisisjava.ch8;

public class SoundableExample {

    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args){
        printSound(new Cat());
        printSound(new Dog());
    }
}

//문제
//printsound를 호출할 때 cat과 dog 객체를 준다
//실행하면 각각 야옹과 멍멍이 출력되도록 한다