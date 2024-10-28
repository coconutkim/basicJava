package lambda.exam2;

public class Person {
    public void action1(Workable workable){
//        void work(String name, String job);
        workable.work("joshua", "programming");
    }

    public void action2(Speakable speakable){
//        void speak(String content);
        speakable.speak("hello");
    }
}
