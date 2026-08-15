package RationalNumberDemo;

public class Main {

    public static void main(String[] args) {

        // Creating two Rational Number objects
        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(1, 3);

        // Display rational numbers
        System.out.println("Rational Number 1: " + r1);
        System.out.println("Rational Number 2: " + r2);

        // Addition
        RationalNumber sum = r1.add(r2);
        System.out.println("Addition: " + sum);

        // Subtraction
        RationalNumber difference = r1.subtract(r2);
        System.out.println("Subtraction: " + difference);

        // Multiplication
        RationalNumber product = r1.multiply(r2);
        System.out.println("Multiplication: " + product);

        // Division
        RationalNumber quotient = r1.divide(r2);
        System.out.println("Division: " + quotient);
    }
}