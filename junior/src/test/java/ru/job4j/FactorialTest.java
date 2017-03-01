package ru.job4j;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * FactorialTest class
 */
public class FactorialTest {

    /**
     * тестирование факториала числа
     */
    @Test
    public void whenTrueFactorial() {
        Factorial factorial = new Factorial();
        assertThat( 720, is(factorial.factorialOfNumber(6)));
    }
}