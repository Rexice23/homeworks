package otus.java.basic;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"5", "3", "5", "9"},
                {"6", "-1", "2", "8"},
                {"4", "3", "1", "20"},
                {"15", "30", "5", "1"},};
        System.out.println("Сумма элементов массива = " + sumElements(array));
    }

    public static int sumElements(String[][] array) {
        if (array.length != 4) {
            throw new AppArraySizeException("Массив должен быть размером 4х4");
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new AppArrayDataException("Ошибка, в ячейке массиве [" + i + "] [" + j + "]"
                                + " лежат неверные данные ");
                    }
                }
            }
            return sum;
        }
    }
}
