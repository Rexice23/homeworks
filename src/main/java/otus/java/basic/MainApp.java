package otus.java.basic;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите имя файла:");
        String searchFile = scanner.nextLine();
        System.out.println("Введите текст для поиска:");
        String text = scanner.nextLine();
        System.out.println("Количество схождений заданного текста: " + findText(searchFile, text));
    }

    private static int findText(String searchFile, String text) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(searchFile, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                while ((index = line.indexOf(text, index)) != -1) {
                    count++;
                    index += text.length();
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла: " + ex.getMessage());
        }

        return count;
    }
}