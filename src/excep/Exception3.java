package excep;

public class Exception3 {

    public static void main(String[] args){
        try{
            Class.forName("java.lang.String");
            System.out.println("there's class of java.lang.String");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println();

        try{
            Class.forName("java.lang.String2");
            System.out.println("there's class of java.lang.String2");;
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
