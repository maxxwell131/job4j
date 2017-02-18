package ru.job4j;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxTest {
    /**
     * тест максимального значения из двух чисел
     */
    @Test
    public void whenFirstNumberMaxThenReturnFirstNumber() {
        Max maxNumber = new Max();
        assertThat( maxNumber.max( 10, 9), is(10));
    }

     /**
     * тест максимального значения из трех чисел
     */
    @Test
    public void whenFirstNumberMaxTwoAndThirdThenReturnFirstNumber() {
        Max maxNumber = new Max();
        assertThat( maxNumber.max( 5, 9, 12), is(12));
    }
}