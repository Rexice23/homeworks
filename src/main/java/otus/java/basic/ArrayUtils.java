package otus.java.basic;

import java.util.Arrays;

public class ArrayUtils {
    public static int[] getElementsAfterLastOne(int[] array) throws RuntimeException {
        int indexLastOne = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                indexLastOne = i;
            }
        }
        if (indexLastOne == -1) {
            throw new RuntimeException("Массив не содержит единиц");
        }
        return Arrays.copyOfRange(array, indexLastOne + 1, array.length);
    }

    public static boolean isArrayConsistsOnlyOfOnesAndTwos(int[] array) {
        boolean isHasOne = false;
        boolean isHasTwo = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                isHasOne = true;
            } else if (array[i] == 2) {
                isHasTwo = true;
            } else {
                return false;
            }
        }
        return isHasOne && isHasTwo;
    }
}