package otus.java.basic.var1;

import java.util.concurrent.TimeUnit;

public class MainVar1 {
    public static void main(String[] args) {
        double[] array = new double[100_000_000];

        long start = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }

        long end = System.nanoTime();

        long time = end - start;
        System.out.println("Время выполнения: " + TimeUnit.NANOSECONDS.toSeconds(time) + " секунд");
    }
}

