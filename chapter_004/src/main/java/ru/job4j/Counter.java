package ru.job4j;

/**
 * Counter class
 */
public class Counter {

    /**
     * суммироваие всех положительных чисел в диапазоне
     * @param start - начало диапазона
     * @param finish - конец диапазона
     * @return - сумма всех положительных чисел
     */
    public int add(final int start, final int finish) {
        int count = 0;
        for (int i = start; i < finish; i++) {
            if ( i%2 == 0) {
                count += i;
            }
        }
        return count;
    }
}