package ru.job4j;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * CounterTest class
 */
public class CounterTest {

    /**
     * тестирование суммы всех четных элементов
     */
    @Test
    public void whenCounterIsTru() {
        Counter counter = new Counter();
        assertThat( 20, is( counter.add(1, 10)));
    }
}
