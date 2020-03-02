public class Lesson {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(6,3);
        Circle circle1 = new Circle(5);
        System.out.println("Square of first rectangle= "+(rectangle1.square()));
        System.out.println("Square of second rectangle= "+(rectangle2.square()));
        System.out.println("Perimeter of first rectangle= "+(rectangle1.perimeter()));
        System.out.println("Perimeter of second rectangle= "+(rectangle2.perimeter()));
        System.out.println("Square of circle= "+(circle1.square()));
        System.out.println("Length of circle= "+(circle1.length()));

    }
}
