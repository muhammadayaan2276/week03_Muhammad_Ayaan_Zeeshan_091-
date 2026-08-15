package TriangleDemo;

public class Main {

    public static void main(String[] args) {

        // Creating two Point objects
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);

        // Display points
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        // Addition of Points
        Point sum = p1.add(p2);
        System.out.println("Addition: " + sum);

        // Subtraction of Points
        Point difference = p2.subtract(p1);
        System.out.println("Subtraction: " + difference);

        // Copy Constructor
        Point p4 = new Point(p1);
        System.out.println("Copied Point: " + p4);

        // Creating a third Point for Triangle
        Point p3 = new Point(2, 1);

        // Creating Triangle using three Points
        Triangle triangle = new Triangle(p1, p2, p3);

        // Display Triangle
        System.out.println("Triangle: " + triangle);
    }
}
 