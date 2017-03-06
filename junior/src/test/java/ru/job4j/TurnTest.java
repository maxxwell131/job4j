package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * Class TurnTest
 */
public class TurnTest {

    /**
     *  тестирование по условию нормально заданного массива
     */
    @Test
    public void whenTrueArray() {
        Turn arr = new Turn();
        arr.array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
        arr.back();
        Assert.assertThat(arr.array, is(expectedArray ));
    }

    /**
     * тестирование по условию , если массив = null
     * @exception - создается когда this.array = null
     */
    @Test(expected = NullPointerException.class)
    public void whenNullElementInArray() {
        Turn arr = new Turn();
        arr.array = null;
        int[] expectedArray = null;
        arr.back();
        Assert.assertThat(arr.array, is(expectedArray ));
    }

    /**
     * тестирование по условию , если массив имеет один элемент
     */
    @Test
    public void whenOneElementInArray() {
        Turn arr = new Turn();
        arr.array = new int[]{1};
        int[] expectedArray = new int[]{1};
        arr.back();
        Assert.assertThat(arr.array, is(expectedArray ));
    }

     /**
     *  тестирование сортировки массива методом "пузырька"
     */
    @Test
    public void whenBubbleSortArrayIsTrue() {
        Turn arr = new Turn();
        arr.array = new int[] { 4, 2, 3, 6, 9, 8, 1, 5, 7};
        int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr.bubbleSort();
        Assert.assertThat(arr.array, is(expectedArray ));
    }
}
