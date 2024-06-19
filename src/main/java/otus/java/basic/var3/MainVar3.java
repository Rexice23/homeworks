package otus.java.basic.var3;

import java.util.ArrayList;
import java.util.List;

public class MainVar3 {
    public static void main(String[] args) {
        double[] array = new double[100_000_000];

        long startTime = System.currentTimeMillis();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            final int threadIndex = i;
            Thread t = new Thread(() -> {
                int startIndex = threadIndex * array.length / 4;
                int endIndex = (threadIndex + 1) * array.length / 4 - 1;

                for (int j = startIndex; j <= endIndex; j++) {
                    array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
            t.start();
            threads.add(t);
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время выполнения цикла: " + (System.currentTimeMillis() - startTime) / 1000 + " " + "секунд");
    }
}
