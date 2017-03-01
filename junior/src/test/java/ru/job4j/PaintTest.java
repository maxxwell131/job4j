package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

/**
 * PaintTest class
 */
public class PaintTest {

    /**
     * тестирование построения пирамды с валидной высотой
     */
    @Test
    public void whenTruePaint() {
        final Paint paint = new Paint();
        final String result = "    ^ \n   ^ ^ \n  ^ ^ ^ \n ^ ^ ^ ^ \n^ ^ ^ ^ ^ \n";

        Assert.assertEquals(result, paint.piramin(5));
    }

    /**
     * тестирование построения пирамды с валидной отрицательной высотой
     */
    @Test
    public void whenTruePaintWithNegativeHeight() {
        final Paint paint = new Paint();
        final String result = "    ^ \n   ^ ^ \n  ^ ^ ^ \n ^ ^ ^ ^ \n^ ^ ^ ^ ^ \n";

        Assert.assertEquals(result, paint.piramin(-5));
    }

    /**
     * тестирование построения пирамды с не валидной высотой
     */
    @Test
    public void whenFalsePaintWithHeightZero() {
        final Paint paint = new Paint();
        final String result = "";

        Assert.assertEquals(result, paint.piramin(0));
    }
}