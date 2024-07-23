package otus.java.basic;

public class ArrayUtils {
    public static int[] getElementsAfterLastOne(int[] array) {
        boolean hasOne = false;
        for (int num : array) {
            if (num == 1) {
                hasOne = true;
                break;
            }
        }

        if (!hasOne) {
            throw new RuntimeException("Массив не содержит единиц");
        }

        int lastOneIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                lastOneIndex = i;
            }
        }

        int[] result = new int[array.length - lastOneIndex - 1];
        System.arraycopy(array, lastOneIndex + 1, result, 0, result.length);

        return result;
    }

    public static boolean isArrayConsistsOnlyOfOnesAndTwos(int[] array) {
        for (int num : array) {
            if (num != 1 && num != 2) {
                return false;
            }
        }
        return true;
    }
}
