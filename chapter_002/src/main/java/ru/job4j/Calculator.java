package ru.job4j;

public class Calculator {
    private double result;

    /**
     * геттер для поля result
     * @return содержимое поля result
     */
    public double getResult() {
        return result;
    }

    /**
     * метод считает сумму двух чисел
     * @param firstNumber - первый аргумент
     * @param secondNumber - второй аргумент
     */
    public void add(double firstNumber, double secondNumber){
        this.result = firstNumber + secondNumber;
    }

    /**
     * метод считает разницу двух чисел
     * @param firstNumber - первый аргумент
     * @param secondNumber - второй аргумент
     */
    public void substruct(double firstNumber, double secondNumber){
        this.result = firstNumber - secondNumber;
    }

    /**
     * метод считает произведение двух чисел
     * @param firstNumber - первый аргумент
     * @param secondNumber - второй аргумент
     */
    public void multiple(double firstNumber, double secondNumber){
        this.result = firstNumber * secondNumber;
    }

    /**
     * метод считает деление двух чисел
     * @param firstNumber - первый аргумент
     * @param secondNumber - второй аргумент
     * @exception ArithmeticException - когда вделение на 0
     */
    public void devide(double firstNumber, double secondNumber){
        if ( 0 != secondNumber) {
            this.result = firstNumber / secondNumber;
        } else {
            throw new ArithmeticException("Devide by ZERO !!!");
        }
    }
}
