package ru.job4j;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PointTest {

    /**
     * тест расстояния место двумя точками
     */
    @Test
    public void whenTryDistanceBetweenTwoPoints() {
        Point pointOne = new Point(60d, 60d);
        Point pointTwo = new Point(0d, 10d);
        assertThat(78.10 , closeTo(pointOne.distanceTo(pointTwo), 0.01d));
    }
}