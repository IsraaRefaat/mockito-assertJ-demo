package com.esraa.simplecalculator;



import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void givenValidInput_whenAddingTwoNumbers_thenReturnCorrectResult() {
        double result = calculator.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void givenInvalidInput_whenAddingTwoNumbers_thenThrowException() {
        try {
            calculator.add(99,1);
            fail("Exception expected");
        }
        catch (Exception e) {
            assertThat(e).isInstanceOf(RuntimeException.class);
        }
    }

    @Test
    void givenValidInput_whenSubtractingTwoNumbers_thenReturnCorrectResult() {
        double result = calculator.subtract(5,3);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void givenInvalidInput_whenSubtractingTwoNumbers_thenThrowException() {
        try {
            calculator.subtract(3,5);
            fail("Exception expected");
        }
        catch (Exception e) {
            assertThat(e).isInstanceOf(RuntimeException.class);
        }
    }

    @Test
    void givenValidInput_whenMultiplyingTwoNumbers_thenReturnCorrectResult() {
        double result = calculator.multiply(5,3);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void givenInvalidInput_whenMultiplyingTwoNumbers_thenThrowException() {
        try {
            calculator.multiply(0,5);
            fail("Exception expected");
        }
        catch (Exception e) {
            assertThat(e).isInstanceOf(RuntimeException.class);
        }
    }

    @Test
    void givenValidInput_whenDividingTwoNumbers_thenReturnCorrectResult() {
        double result = calculator.divide(6,3);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void givenInvalidInput_whenDividingTwoNumbers_thenThrowException() {
        try {
            calculator.divide(5,0);
            fail("Exception expected");
        }
        catch (Exception e) {
            assertThat(e).isInstanceOf(RuntimeException.class);
        }
    }



}
