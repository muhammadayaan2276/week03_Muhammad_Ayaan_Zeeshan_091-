package RationalNumberDemo;

public class RationalNumber {

    private int numerator;
    private int denominator;

    // Constructor
    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Addition
    public RationalNumber add(RationalNumber other) {
        int newNumerator =
                this.numerator * other.denominator
                + other.numerator * this.denominator;

        int newDenominator =
                this.denominator * other.denominator;

        return new RationalNumber(newNumerator, newDenominator);
    }

    // Subtraction
    public RationalNumber subtract(RationalNumber other) {
        int newNumerator =
                this.numerator * other.denominator
                - other.numerator * this.denominator;

        int newDenominator =
                this.denominator * other.denominator;

        return new RationalNumber(newNumerator, newDenominator);
    }

    // Multiplication
    public RationalNumber multiply(RationalNumber other) {
        return new RationalNumber(
                this.numerator * other.numerator,
                this.denominator * other.denominator
        );
    }

    // Division
    public RationalNumber divide(RationalNumber other) {
        return new RationalNumber(
                this.numerator * other.denominator,
                this.denominator * other.numerator
        );
    }

    // toString()
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}