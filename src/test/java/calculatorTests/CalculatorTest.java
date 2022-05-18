package calculatorTests;

import calculatorHomeTask.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
        System.out.println("Count started");
    }

    @Test
    public void testDigitsAmongSymbolsCalculation() {
        assertEquals(12, calculator.countDigitsAmongSymbols("lll3lll3lll3lll3"));
    }

    @Test
    public void testCalculationWithoutDigits() {
        assertEquals(0, calculator.countWithoutDigits("lllllllllll"));
    }

    @Test
    public void testOnlyDigitsCalculation() {
        assertEquals(8, calculator.countOnlyDigits("2 2 2 2"));
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Count finished");

    }


}
