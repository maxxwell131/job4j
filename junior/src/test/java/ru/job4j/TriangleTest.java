package ru.job4j;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {

    /**
     * расчет площади треугольника
     */
    @Test
    public void whenTriangleIsTrue() {
        Triangle triangle = new Triangle(new Point(0d, 0d),
                                            new Point( 0d, 10d),
                                                new Point( 60d, 60d));
        assertThat( 300.00, closeTo(triangle.area(), 0.01));
    }

    /**
     * расчет площади не существующего треугольника
     */
    @Test
    public void whenTriangleIsFalse() {
        Triangle triangle = new Triangle(new Point(0d, 0d),
                new Point( 0d, 0d),
                new Point( 100d, 0d));
        assertThat( 0.00, closeTo(triangle.area(), 0.01));
    }
}