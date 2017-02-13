package ru.job4j;

public class Max {
    /**
     * метод возвращает максимальное значение из двух чисел int
     * @param first - первое число
     * @param second - второе число
     * @return - int, максимальное значения из первого и второго числа
     */
    public int max( int first, int second) {
        return ( first > second)? first: second;
    }
}