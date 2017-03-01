package ru.job4j;

/**
 * Paint class
 */
public class Paint {

    final static String PRINT_SYMBOL = "^ ";
    final static String PRINT_SPACE = " ";

    /**
     * рисование пирамиды
     * @param h - высота пирамиды в символах
     * @return - получившияся строка с изображением пирамиды
     */
    public String piramin(final int h) {

        StringBuilder result = new StringBuilder();

        if (h != 0) {
            for (int row = 1; row <= Math.abs(h); row++) {

                for (int colSpace = 0; colSpace < Math.abs(h) - row; colSpace++) {
                    result.append(PRINT_SPACE);
                }

                for (int colSymbol = 1; colSymbol <= Math.abs(h); colSymbol++) {
                    if (colSymbol > (Math.abs(h) - row) && (colSymbol < (Math.abs(h) + row)))
                        result.append(PRINT_SYMBOL);
                }
                result.append("\n");
            }
        }
        return result.toString();
    }
}