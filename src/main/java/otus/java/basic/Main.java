package otus.java.basic;

import java.util.Arrays;

import static otus.java.basic.ArrayUtils.getElementsAfterLastOne;
import static otus.java.basic.ArrayUtils.isArrayConsistsOnlyOfOnesAndTwos;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 2};
        int[] elementsAfterLastOne = getElementsAfterLastOne(array);
        System.out.println("Элементы после последней единицы: " + Arrays.toString(elementsAfterLastOne));

        array = new int[]{1, 2};
        boolean onlyOnesAndTwos = isArrayConsistsOnlyOfOnesAndTwos(array);
        System.out.println("Массив состоит только из 1 и 2: " + onlyOnesAndTwos);
    }
}
