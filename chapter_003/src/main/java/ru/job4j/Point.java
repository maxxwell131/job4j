package ru.job4j;

public class Point {
    public double x;
    public double y;

    /**
     * Конструктор
     * @param x - первая координата
     * @param y - вторая координата
     */
    public Point(final double x,final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Расчет длины отрезка(расстояние между точками)
     * @param point - координаты точки, до которой необходимо расчитать расстояние
     * @return - величина длины отрезка
     */
    public double distanceTo(final Point point) {
    //calculate distance between two points
       return Math.sqrt( Math.pow( point.x - this.x, 2.0d) + Math.pow( point.y - this.y, 2.0d));
    }
}