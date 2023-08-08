// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("the rectangle Area = " + rectangle.calArea());
        System.out.println("the rectangle perimeter = " +rectangle.calPermitere());

        System.out.println("=======================================");

        Triangle triangle = new Triangle();
        System.out.println("Triangle Area = " + triangle.calArea());
        System.out.println("Rectangle perimeter = " + triangle.calPermitere());

        System.out.println("=======================================");

        Circle circle = new Circle();
        System.out.println("Circle Area = " + circle.calArea());
        System.out.println("Circle perimeter = " + circle.calPermitere());
    }
}