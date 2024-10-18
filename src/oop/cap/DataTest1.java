package oop.cap;

class Data {
    private int x,y;
    private int value;

    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getValue(){
        value = x+y;
        return value;
    }
}

public class DataTest1 {
    // 최대 하나의 퍼블릭 클래스를 포함할 수 있다
    public static void main(String[] args){
        Data d = new Data(); // 생성자 함수
        d.setX(100);
        d.setY(200);
        int val = d.getValue();
//        int n1 = d.x;
//        int n2 = d.y;
        System.out.println("result: "+val);
    }
}

