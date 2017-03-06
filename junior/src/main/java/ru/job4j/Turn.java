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
                this.array[i] = this.array[i] ^ this.array[j];
                this.array[j] = this.array[j] ^ this.array[i];
                this.array[i] = this.array[i] ^ this.array[j];
            }
        } else {
                   throw new NullPointerException("Exception");
        }
    }
}
