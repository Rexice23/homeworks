package otus.java.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Object monitor = new Object();
        char[] currentChar = {'A'};

        executorService.execute(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 5; i++) {
                    while (currentChar[0] != 'A') {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("A");
                    currentChar[0] = 'B';
                    monitor.notifyAll();
                }
            }
        });

        executorService.execute(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 5; i++) {
                    while (currentChar[0] != 'B') {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("B");
                    currentChar[0] = 'C';
                    monitor.notifyAll();
                }
            }
        });

        executorService.execute(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 5; i++) {
                    while (currentChar[0] != 'C') {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("C");
                    currentChar[0] = 'A';
                    monitor.notifyAll();
                }
            }
        });

        executorService.shutdown();

    }
}