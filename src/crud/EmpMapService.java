package crud;

import java.util.HashMap;
import java.util.Set;

public class EmpMapService {
    private HashMap<Integer, Employee> map;
    //키는 순서가 없지만 중복이 있으면 안 된다

    public EmpMapService() {
        map = new HashMap<Integer, Employee>();
    }

    public void addEmployee(Employee employee) {
        /*boolean flag = false;
        Set<Integer> set = map.keySet(); //키를 모은다
        for(int key : set){
            if(map.get(key).getEmpNo() == employee.getEmpNo()){ //사원 정보가 이미 존재하는 경우
                flag = true;
                System.out.println(employee.getEmpNo()+" does exist");
            }
        }
        if(flag == false){
            map.put(employee.getEmpNo(),employee);
            System.out.println(employee.getName()+" has been registered");
            return;
        }*/
        //위의 코드와 달리 단순해진 것을 볼 수 있다
        if (map.containsKey(employee.getEmpNo())) { //키 값으로 찾아서 정보가 있으면
            System.out.println(employee.getEmpNo() + " does exist");
            return;
        } else {
            map.put(employee.getEmpNo(), employee); //정보가 없으면 추가한다
            System.out.println(employee.getName() + " has been registered");
        }
    }

    public void deleteEmployee(int empNo) {
        //맵에 들어있는 모든 키의 집합
        //중복 없이 set 형태로 관리 가능
        Set<Integer> set = map.keySet();
        boolean flag = false;

        /*for (int key : set) {
            if (key == empNo) { //키가 존재하면 삭제를 진행
                flag = true;
                System.out.println(map.get(key).getEmpNo() + " has been deleted");
                map.remove(key);
                return;
            }
            if (!flag) {
                System.out.println("there's no info to delete");*/

        Employee employee = map.remove(empNo);
        if (employee == null) {
            System.out.println("there's no info to delete");
            return;
        } else {
            System.out.println(employee.getName() + " has been deleted");
        }
    }

    public void updateEmployee(int empNo, Employee employee){
        //맵에 사원번호가 있으면
        if(map.containsKey(empNo)){
            map.put(empNo,employee); //주어진 키와 값을 추가한다, 저장이 되면 값을 리턴
            System.out.println(employee.getName()+"'s info has been updated");
        }else {
            System.out.println("there's no info to update");
        }
    }
}
