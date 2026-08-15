package ComplexNumberDemo;

public class Main {

    public static void main(String[] args) {

        // Creating two Complex Number objects
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        // Display complex numbers
        System.out.println("Complex Number 1: " + c1);
        System.out.println("Complex Number 2: " + c2);

        // Addition
        ComplexNumber sum = c1.add(c2);
        System.out.println("Addition: " + sum);

        // Subtraction
        ComplexNumber difference = c1.subtract(c2);
        System.out.println("Subtraction: " + difference);
    }
}