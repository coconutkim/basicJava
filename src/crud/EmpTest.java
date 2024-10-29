package crud;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpTest {
    public static void main(String[] args){
        EmpListService empListService = new EmpListService();
        EmpMapService empMapService = new EmpMapService();
        Regular regular1 = new Regular(190,"java",100,100);
        Regular regular2 = new Regular(65, "java", 52,65);
        Regular regular3 = new Regular(87,"java",88,21);
        Temporary temporary = new Temporary(6500,"kelly",80,98,54);

        empListService.addEmployee(regular1);
        empListService.addEmployee(regular2);
        empListService.addEmployee(regular3);
        /*System.out.println();
        empService.getEmployee();
        System.out.println();
//        empService.deleteEmployee(190);
        empService.updateEmployee(new Regular(851,"mingyu",98,32));*/

        //findEmployee 메소드의 반환 타입이 ArrayList
        ArrayList<Employee> arrayList = empListService.findEmployee("java");
        Iterator<Employee> iterator = arrayList.iterator();
        //이터레이터는 컬렉션에 저장된 요소들을 순차적으로 읽어오기 위해 사용
//        hasNext()
//        읽어올 객체가 남아 있으면 true를 리턴, 없으면 false를 리턴
//        next()
//        컬렉션에서 하나의 객체를 읽어온다
//        next()를 호출하기 전에 hasNext()를 통해 읽어올 다음 요소가 있는지 먼저 확인하는 것이 좋다
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            String string = employee.toString();
            System.out.println(string);
        }

        /*empMapService.addEmployee(regular1);
        empMapService.addEmployee(regular2);
        empMapService.addEmployee(regular1);
        empMapService.deleteEmployee(190);
        //employee에 새로운 정보를 입력해야 한다
        empMapService.updateEmployee(65,new Regular(88,"dk",65,36));*/
    }
}
