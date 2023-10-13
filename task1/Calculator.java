public class Calculator {

    public static int add(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public static int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    public static int multiply(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    public static double calculateDiscount(double purchaseAmount, int discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid input: purchase amount and discount percentage must be non-negative, and discount percentage must be between 0 and 100.");
        }

        double discountAmount = (purchaseAmount * discountPercentage) / 100.0;
        return purchaseAmount - discountAmount;
    }
}