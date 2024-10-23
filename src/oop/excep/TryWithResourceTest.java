package oop.excep;

public class TryWithResourceTest {
    public static void main(String[] args) {

        MyResource res = new MyResource("A");
//        MyResource res = new MyResource(1000); //에러 발생
        String data = res.read1();
        int value = Integer.parseInt(data); //문자를 정수형으로 바꾼다
        System.out.println("value = " + value);
        //리턴값이 나오면 아무 오류가 없다는 것

        System.out.println();

        try (MyResource res2 = new MyResource("A");) {
            String data2 = res2.read2();
            int value2 = Integer.parseInt(data2);
            System.out.println("value2 = " + value2);
        } catch (NumberFormatException e) {
            System.out.println("exceptional handling 1: " + e.getMessage());
            //exception이 편하긴 하지만 범위를 너무 넓혀서 찾는데 시간이 좀 걸린다
        } catch (Exception e) {
            System.out.println("exceptional handling 2: " + e.getMessage());
        }

        System.out.println();


    }
}
