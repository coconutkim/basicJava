package oop.excep;

public class Exception4 {
    public static void main(String[] args){

        String[] array = {"100","1oo",null,"200"};

//        for(int i=0;i<array.length;i++){
//            int num = Integer.parseInt(array[i]);
//            System.out.println("array["+i+"]="+num);
//            예외가 1oo에서 걸려버림
//        }

        for(int i=0;i<array.length;i++) {
            try{
                int num = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]="+num);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("exceed index of array: "+e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("can't convert to number: "+e.getMessage());
            }
        }
    }
}

//catch(Exception e){
//    e.printStackTrace();
//        }
//어떤 오류인지 exception이 알아서 찾아 알려준다
