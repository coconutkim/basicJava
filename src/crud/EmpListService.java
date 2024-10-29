package crud;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpListService {
    //CRUD
    private ArrayList<Employee> list;

    public EmpListService() {
        list = new ArrayList<Employee>();
    }

    //사원 정보 추가
    public void addEmployee(Employee employee) {
        boolean flag = false;
        for (Employee emp : list) {
            if (employee.getEmpNo() == emp.getEmpNo()) {
                flag = true; //사원 정보가 이미 존재하면 정보를 가져온다
                System.out.println(employee.getEmpNo() + " does exist");
                return;
            }
        }
        if (flag == false) { //목록에 없으면
            list.add(employee); //사원을 추가
            System.out.println(employee.getEmpNo() + " is saved");
        }
    }

    public void getEmployee() {
        for (Employee emp : list) {
            System.out.println(emp.calcTotalPay());
        }
    }

    //사원 정보 삭제
    public void deleteEmployee(int empNo) {
        boolean flag = false;
        for (Employee emp : list) {
            if (emp.getEmpNo() == empNo) {
                flag = true;
                list.remove(empNo); //사원 정보 삭제
                System.out.println(emp.getEmpNo() + " is deleted");
                return;
            }
        }
        if (flag == false) {
            System.out.println("there's no info to delete");
            return;
        }
    }

    //사원 정보 업데이트
    public void updateEmployee(Employee employee) {
        boolean flag = false;
        //set(index, object)
        //0번부터 리스트 개수만큼 반복한다
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpNo() == employee.getEmpNo()) {
                flag = true;
                list.set(i, employee); //e를 i라는 번호로 업데이트한다
                System.out.println(employee.getName() + "'s info has updated");
                return;
            }
        }
        if (!flag) {
            System.out.println("there's no info to update");
            return;
        }
    }

    //이름 검색: 자바
    //같은 이름을 가진 경우를 모두 출력
    public ArrayList<Employee> findEmployee(String name) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        //가져와서 비교해본다
        //private ArrayList<Employee> list;
        for (Employee employee : list) { //기존의 사원 리스트에서
            if (employee.getName().equals(name)) {
                arrayList.add(employee);
            }
        }
        return arrayList;
    }
}