package otus.java.basic.client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientCalculator {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String operations = input.readLine();
            System.out.println(operations);

            System.out.println("Введите выражения для вычисления в формате '5 + 5': ");
            String expression = scanner.nextLine();

            output.println(expression);

            String result = input.readLine();
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Ошибка клиента: " + e.getMessage());
        }
    }
}

