package thread;

public class HorseTest3 {
    public static void main(String[] args){
        Thread t1 = new Thread(new Horse2(1));
        Thread t2 = new Thread(new Horse2(2));
        Thread t3 = new Thread(new Horse2(3));
        Thread t4 = new Thread(new Horse2(4));
        Thread t5 = new Thread(new Horse2(5));
        Thread t6 = new Thread(new Horse2(6));
        Thread t7 = new Thread(new Horse2(7));
        Thread t8 = new Thread(new Horse2(8));
        Thread t9 = new Thread(new Horse2(9));
        Thread t10 = new Thread(new Horse2(10));

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);
        t6.setPriority(6);
        t7.setPriority(7);
        t8.setPriority(8);
        t9.setPriority(9);
        t10.setPriority(10);

        System.out.println("the end of main");
    }
}
