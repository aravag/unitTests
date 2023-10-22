package task3;

import seminars.third.hw.MainHW;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {
    // Task 1
    @ParameterizedTest
    @ValueSource(ints = {2, 4, -10})
    public void testEvenNumber(int number) {
        MainHW yourObject = new MainHW();
        boolean result = yourObject.evenOddNumber(number);
        assertTrue(result, number + " должно считаться четным.");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, -27})
    public void testOddNumber(int number) {
        MainHW yourObject = new MainHW();
        boolean result = yourObject.evenOddNumber(number);
        assertFalse(result, number + " должно считаться нечетным.");
    }

    // Task 2

    @ParameterizedTest
    @ValueSource(ints = {50, 67, 99})
    public void testNumberInIntervalWithinBounds(int number) {
        MainHW yourObject = new MainHW();
        boolean result = yourObject.numberInInterval(number);
        assertTrue(result, number + " должно попадать в интервал от 25 до 100.");
    }

    @ParameterizedTest
    @ValueSource(ints = {9, 24, 110})
    public void testNumberInIntervalOutsideBounds(int number) {
        MainHW yourObject = new MainHW();
        boolean result = yourObject.numberInInterval(number);
        assertFalse(result, number + " не должно попадать в интервал от 25 до 100.");
    }
}
