package ru.job4j;
/**
 * Class Triangle
 * a, b, c - координаты вершины
 * distanceAB, distanceAC, distanceBC - длина сторон треугольника
 */
public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    private double distanceAB;
    private double distanceAC;
    private double distanceBC;

    /**
     * Конструктор
     * @param a - координаты вершины
     * @param b - координаты вершины
     * @param c - координаты вершины
     */
    public Triangle(final Point a,final Point b,final Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.distanceAB = this.a.distanceTo(this.b);
        this.distanceAC = this.a.distanceTo(this.c);
        this.distanceBC = this.b.distanceTo(this.c);
    }

    /**
     * проверка, существует ли такой треугольник
     * @param triangle - треугольник с координатами вершин
     * @return - существует(true), не существует(false)
     */
    public boolean thereIsATriangle(final Triangle triangle){
        boolean result = false;

        if ((this.distanceAB + this.distanceAC) > this.distanceBC) {
            if ((this.distanceAB + this.distanceBC) > this.distanceAC) {
                if ((this.distanceBC + this.distanceAC) > this.distanceAB) {
                    result = true;
                }
            }
        }
        return result;
    }

    /**
     * расчет площади треугольника
     * @return - площадь треугольника, 0 - если треугольник не существует
     */
    public double area() {
//calculate the triangle area
        double result = 0;
        if (true == this.thereIsATriangle(this)) {
            double perimetr = (this.distanceAB + this.distanceAC + this.distanceBC)/2;
            result = Math.sqrt(perimetr * (perimetr - this.distanceBC)
                    * (perimetr - this.distanceAC)
                    * (perimetr - this.distanceAB));
        }
        return result;
    }
}