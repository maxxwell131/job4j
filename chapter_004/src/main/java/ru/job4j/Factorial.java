package ru.job4j;

/**
 * Factorial class
 */
public class Factorial {

    /**
     * расчет фактриала числа
     * @param number - число для расчета факториала
     * @return - факториал
     */
    public int factorialOfNumber(final int number) {

        int result = 1;

        if (number > 1) {
            result = number * factorialOfNumber(number - 1);
        }
        return result;
    }
}