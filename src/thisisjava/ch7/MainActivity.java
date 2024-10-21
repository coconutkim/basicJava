package thisisjava.ch7;

public class MainActivity extends Activity {
    @Override
    public void onCreate(){
//        new Activity().onCreate();
        super.onCreate();
        System.out.println("additional execution contents");
    }
}
