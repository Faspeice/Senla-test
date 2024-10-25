package tasks.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину пароля (от 8 до 12): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            System.out.println("Длина пароля должна быть от 8 до 12 символов.");
        } else {
            PasswordGenerator generator = new PasswordGenerator();
            String password = generator.generatePassword(length);
            System.out.println("Сгенерированный пароль: " + password);
        }

        scanner.close();
    }

}
