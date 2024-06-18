package otus.java.basic.var2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainVar2 {
        public static void main(String[] args) {
            double[] array = new double[100_000_000];

            ExecutorService executor = Executors.newFixedThreadPool(4);

            long start = System.nanoTime();

            for (int i = 0; i < 4; i++) {
                int startIdx = i * 25_000_000;
                int endIdx;
                if (i == 3) {
                    endIdx = array.length;
                } else {
                    endIdx = (i + 1) * 25_000_000;
                }
                executor.submit(() -> {
                    for (int j = startIdx; j < endIdx; j++) {
                        array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                    }
                });
            }

            executor.shutdown();
            while (!executor.isTerminated()) {
            }

            long end = System.nanoTime();

            long time = end - start;
            System.out.println("Время выполнения: " + TimeUnit.NANOSECONDS.toSeconds(time) + " секунд");
        }
    }

