package ru.job4j;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    /**
     * Метод для тестирования сложения двух чисел
     */
    @Test
    public void whenAddShouldSummateIt() {
        Calculator calculator = new Calculator();
        calculator.add( 1, 1);
        double result = calculator.getResult();
        assertThat( result, is(2d));
    }

    /**
     * Метод для тестирования вычитания двух чисел
     */
    @Test
    public void whenSubShouldSubstructedIt() {
        Calculator calculator = new Calculator();
        calculator.substruct( 2, 1);
        assertThat( calculator.getResult(), is(1d));
    }

    /**
     * Метод для тестирования умножения двух чисел
     */
    @Test
    public void whenMultShouldMultipled () {
        Calculator calculator = new Calculator();
        calculator.multiple( 3, 3);
        assertThat( calculator.getResult(), is(9d));
    }

    /**
     * Метод для тестирования деления первого числа на 0
     */
    @Test
    public void whenDevShouldDevidedByZero () {
        Calculator calculator = new Calculator();
        try {
            calculator.devide( 10, 0);
        } catch (ArithmeticException e) {
            assertThat( e.getMessage(),is("Devide by ZERO !!!"));

        }
    }

    /**
     * Метод для тестирования деления двух чисел
     */
    @Test
    public void whenDevShouldDevided () {
        Calculator calculator = new Calculator();
            calculator.devide( 10, 2);
            assertThat( calculator.getResult(), is(5d));
    }
}