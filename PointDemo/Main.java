public class Main {

    public static void main(String[] args) {

        // Creating two Point objects
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);

        // Display points
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        // Addition
        Point sum = p1.add(p2);
        System.out.println("Addition: " + sum);

        // Subtraction
        Point difference = p2.subtract(p1);
        System.out.println("Subtraction: " + difference);

        // Copy Constructor
        Point p3 = new Point(p1);
        System.out.println("Copied Point: " + p3);
    }
}