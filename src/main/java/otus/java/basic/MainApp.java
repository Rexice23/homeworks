package otus.java.basic;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String directoryPath = "/Users/";
        listOfDirectory(directoryPath);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите путь до файла: ");
        String filePath = scanner.nextLine();
        readFile(filePath);

        System.out.println();
        System.out.print("Напишите текст: ");
        String textForFile = scanner.nextLine();
        writeToFile(filePath, "\n" + textForFile);
    }

    private static void listOfDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] filesList = directory.listFiles();
            if (filesList != null) {
                System.out.println("Файлы в директории " + directoryPath + ":");
                for (File file : filesList) {
                    if (!file.isDirectory()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("Произошла ошибка при чтении содержимого директории.");
            }
        } else {
            System.out.println(directoryPath + " не является директорией.");
        }
    }

    private static void readFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            try (InputStreamReader in = new InputStreamReader(new FileInputStream(filePath))) {
                int n = in.read();
                if (file.length() == 0) {
                    System.out.println("В файле пусто");
                } else {
                    System.out.println("Содержимое файла: ");
                    while (n != -1) {
                        System.out.println((char) n);
                        n = in.read();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файл не найден");
        }
    }

    private static void writeToFile(String filePath, String textForFile) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filePath, true))) {
            byte[] buffer = textForFile.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
            System.out.println("Файл обновлен");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}