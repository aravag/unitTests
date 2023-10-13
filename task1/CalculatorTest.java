import org.assertj.core.api.Assertions;

public class CalculatorTest {

    public static void main(String[] args) {
        runCalculationTests();
        runSquareRootExtractionTests();
        runCalculateDiscountTests();
    }

    public static void runCalculationTests() {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivisionByZero();
    }

    public static void testAddition() {
        Assertions.assertThat(Calculator.add(2, 6)).isEqualTo(8);
    }

    public static void testSubtraction() {
        Assertions.assertThat(Calculator.subtract(2, 2)).isEqualTo(0);
    }

    public static void testMultiplication() {
        Assertions.assertThat(Calculator.multiply(2, 7)).isEqualTo(14);
    }

    public static void testDivisionByZero() {
        try {
            Calculator.divide(10, 0);
            System.out.println("Test failed: No exception was thrown for division by zero");
        } catch (ArithmeticException e) {
            Assertions.assertThat(e.getMessage()).contains("Division by zero is not allowed");
        }
    }

    public static void runSquareRootExtractionTests() {
        testPositiveSquareRootExtraction();
        testNegativeSquareRootExtraction();
    }

    public static void testPositiveSquareRootExtraction() {
        Assertions.assertThat(Calculator.squareRoot(169)).isEqualTo(13.0, Assertions.offset(0.01));
    }

    public static void testNegativeSquareRootExtraction() {
        try {
            Calculator.squareRoot(-9);
            System.out.println("Test failed: No exception was thrown for negative number");
        } catch (IllegalArgumentException e) {
            Assertions.assertThat(e.getMessage()).contains("Cannot calculate square root of a negative number");
        }
    }

    public static void runCalculateDiscountTests() {
        testValidDiscountCalculation();
        testInvalidDiscountInput();
    }

    public static void testValidDiscountCalculation() {
        double purchaseAmount = 100.0;
        int discountPercentage = 20;
        double discountedAmount = Calculator.calculateDiscount(purchaseAmount, discountPercentage);
        Assertions.assertThat(discountedAmount).isEqualTo(80.0, Assertions.offset(0.01));
    }

    public static void testInvalidDiscountInput() {
        try {
            Calculator.calculateDiscount(-100, 20);
            System.out.println("Test failed: No exception was thrown for negative purchase amount");
        } catch (ArithmeticException e) {
            Assertions.assertThat(e.getMessage()).contains("Invalid input: purchase amount and discount percentage must be non-negative, and discount percentage must be between 0 and 100.");
        }
    }
}
