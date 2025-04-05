package homework18;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
        System.out.println("Calculator initialized");
    }

    @AfterAll
    static void clearData() {
        calculator = null;
        System.out.println("Calculator cleared");
    }

    @Test
    @Order(1)
    @DisplayName("Adding two numbers")
    void additionTest() {
        int result = calculator.add(10, 5);
        System.out.println("Result:" + result);
        assertEquals(15, result);
    }

    @Test
    @Order(2)
    @DisplayName("Subtracting two numbers")
    void subtractionTest() {
        int result = calculator.subtract(10, 5);
        System.out.println("Result:" + result);
        assertEquals(5, result);
    }

    @Test
    @Order(3)
    @DisplayName("Multiplying two numbers")
    void multiplicationTest() {
        int result = calculator.multiply(10, 5);
        System.out.println("Result:" + result);
        assertEquals(50, result);
    }

    @Test
    @Order(4)
    @DisplayName("Dividing two numbers")
    void divisionTet() {
        int result = calculator.divide(10, 5);
        System.out.println("Result:" + result);
        assertEquals(2, result);
    }

    @Test
    @Order(5)
    @DisplayName("Dividing by zero")
    void divisionByZeroTest() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        System.out.println("Expected exception: " + exception.getMessage());
    }

}
