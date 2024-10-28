package lambda.exam1;

@FunctionalInterface //함수형 인터페이스임을 보장하기 위함
//앞에 붙이는 것은 선택사항
public interface Calculable {
    void calculate(int x, int y);
}
