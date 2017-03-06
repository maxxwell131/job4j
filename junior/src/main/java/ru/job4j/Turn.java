package ru.job4j;

/**
 * Class Turn
 */

public class Turn {
    public int[] array;

    /**
     * метод переворачивает масси
     * @exception - создается когда this.array = null
     */
    public void back() {
        if (null != this.array) {
            for (int i = 0, j = this.array.length - 1; i < (int) this.array.length / 2; i++, j--) {
                this.swapArrayElements(i, j);
            }
        } else {
                   throw new NullPointerException("Exception");
        }
    }

    /**
     * перестановка элементов массива между собой
     * @param i - первый элемент
     * @param j - второй элемент
     */
    public void swapArrayElements(int i, int j) {
        this.array[i] = this.array[i] ^ this.array[j];
        this.array[j] = this.array[j] ^ this.array[i];
        this.array[i] = this.array[i] ^ this.array[j];
    }

    /**
     * сортировка массива методом "пузырька"
     */
    public void bubbleSort () {
        boolean swapped = true;
        int j = 0;

        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < this.array.length - j; i++) {
                if (this.array[i] > this.array[i+1]){
                    swapped = true;
                    this.swapArrayElements( i, i + 1);
                }
            }
        }
    }
}
