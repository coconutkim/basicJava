package oop.excep;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println("start program\n");
        printLength("this is java");
        }

        private static void printLength(String data){
        try{
            int len = data.length();
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("the end");
        }

//        int len = data.length();
//        System.out.println("number of letters: "+len);
    }
}
