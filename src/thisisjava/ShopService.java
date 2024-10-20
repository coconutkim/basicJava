//package thisisjava;
//
//public class ShopService {
////    예제 코드가 실행되면 메세지가 출력되도록 한다
////    싱글톤 패턴을 사용해서 클래스를 작성한다
//
////    ShopService obj1 = ShopService.getInstance();
////    ShopService obj2 = ShopService.getInstance();
////    if(obj1 == obj2) {
////        System.out.println("같은 ShopService 객체입니다.");
////    } else {
////        System.out.println("다른 ShopService 객체입니다.");
////    }
//
////    싱글톤 패턴
////            클래스의 인스턴스가 단 하나만 생성되며 전역적으로 접근 가능하다
////            lazy initialization: 인스턴스가 처음 필요할 때까지 생성되지 않을 수 있다
//
////    구현하는 법
////            생성자를 private으로 설정해서 외부에서 인스턴스 생성을 막는다
////            정적 메소드를 제공
////            클래스 내부에 인스턴스를 저장할 정적 변수를 생성
//
//    private String ShopService singleton = new ShopService(){
//
//        private ShopService(){}
//
//        static ShopService getInstance(){
//            return singleton;
//        }
//    }
//}
