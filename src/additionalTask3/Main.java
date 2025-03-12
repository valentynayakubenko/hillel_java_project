package additionalTask3;

public class Main extends Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.setSideA(6);
        triangle.setSideB(6);
        triangle.setSideC(7);

        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
    }

}
