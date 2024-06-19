package week3PA2;

import java.math.BigInteger;
import java.util.Scanner;

public class RationalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numerator of the first rational number:");
        BigInteger num1 = input.nextBigInteger();
        
        System.out.println("Enter the denominator of the first rational number:");
        BigInteger den1 = input.nextBigInteger();
        
        Rational r1 = new Rational(num1, den1);

        System.out.println("Enter the numerator of the second rational number:");
        BigInteger num2 = input.nextBigInteger();
        
        System.out.println("Enter the denominator of the second rational number:");
        BigInteger den2 = input.nextBigInteger();
        
        Rational r2 = new Rational(num2, den2);

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        System.out.println("Addition: " + r1.add(r2));
        System.out.println("Subtraction: " + r1.subtract(r2));
        System.out.println("Multiplication: " + r1.multiply(r2));
        System.out.println("Division: " + r1.divide(r2));

        input.close();
    }
}
