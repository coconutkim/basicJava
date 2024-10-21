package thisisjava.ch6;

public class MemberService {
//    login()
//    매개값으로 id, password 제공
//    아이디가 hong, 패스워드가 12345일 경우에만 참으로 리턴
//
//    logout()
//    id만 매개값으로
//    아이디+님이 로그아웃 되었습니다 가 출력되도록 할 것

    boolean login(String id, String password){
        if(id.equals("hong") && password.equals("12345")){
            return true;
        }

        else{
            return false;
        }
    }

    void logout(String id){
        // void로 정의된 이유는 메서드가 어떤 값을 반환하지 않기 때문
        // void = 아무것도 반환하지 않는다
        System.out.println(id+"님이 로그아웃 되었습니다");
    }
}
