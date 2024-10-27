package io.test;

public class User1 {
    //필드 선언
    String name;
    int age;
    String phone;

    //생성자 정의
    public User1(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    //사용자의 정보를 반환하는 방법을 정의한 메소드
    public String getUserInfo(){
        return "name: "+name+" | age: "+age+" | phone: "+phone;
    }
}
