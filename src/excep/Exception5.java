package excep;

public class Exception5 {
    public static void main(String[] args){

        try{
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("class don't exist: "+e.getMessage());
        } //예외가 발생, 즉 파일을 찾지 못하면 위의 출력값이 나온다
    }

    private static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2"); //파일이 있는지 검색
    }
    //예외 처리가 뜨지 않으면 파일을 정상적으로 찾았다는 것
}
