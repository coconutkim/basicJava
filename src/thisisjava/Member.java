package thisisjava;

public class Member {
    // 필드 선언
    private String name;
    private String id;
    private String password;
    private int age;

//    Member mem = new Member(){
    // 생성자 선언
    public Member(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getPassword(){
        return password;
    }
}
