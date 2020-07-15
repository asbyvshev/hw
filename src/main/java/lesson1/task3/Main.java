package lesson1.task3;

public class Main {
    public static void main(String[] args) {

        Area circle = new MyCircle();
        Area quadrant = new MyQuadrant();
        Area triangle = new MyTriangle();

        circle.sqr();
        quadrant.sqr();
        triangle.sqr();
    }
}
