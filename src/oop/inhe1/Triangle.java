package oop.inhe1;

public class Triangle extends Shape{
//    public void calcTriangle(float width, float height){
//        super.area = width * height / 2.0f;
//        0f: 부동 소수점 수를 나타내기 위해 사용되는 접미사
//        float 타입임을 명시적으로 지정
//    }
    public void calcArea(float width, float height){
        super.area = width * height / 2;
    }
}
