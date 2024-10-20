package oop.inhe1;

public class ShapeTest {
    public static void main(String[] args){
        int width = 10;
        int height = 20;

        Rectangle rec = new Rectangle();
        rec.calcRectangle(width, height);

        Triangle tri = new Triangle();
        tri.calcTriangle(width,height);
    }
}
