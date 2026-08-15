package ComplexNumberDemo;

public class ComplexNumber {

    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
            this.real + other.real,
            this.imaginary + other.imaginary
        );
    }

    // Subtraction
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(
            this.real - other.real,
            this.imaginary - other.imaginary
        );
    }

    // toString()
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}