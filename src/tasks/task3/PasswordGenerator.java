package tasks.task3;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public String generatePassword(int length) {
        String combinedChars = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = secureRandom.nextInt(combinedChars.length());
            password.append(combinedChars.charAt(index));
        }

        return password.toString();
    }
}