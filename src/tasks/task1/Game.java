package tasks.task1;

import java.util.Random;
import java.util.Scanner;

class Game {
    private final Word word;
    private final Player player;
    private final Scanner scanner;
    private final GameDisplay display;

    public Game(String[] words, int maxLives) {
        Random random = new Random();
        String chosenWord = words[random.nextInt(words.length)];
        this.word = new Word(chosenWord);
        this.player = new Player(maxLives);
        this.scanner = new Scanner(System.in);
        this.display = new GameDisplay();
    }

    public void play() {
        display.showWelcomeMessage();

        while (player.isAlive() && !word.isGuessed()) {
            display.showGameStatus(word.getGuessedWord(), player.getLives());

            display.showInputMessage();
            char guess = getUserInput();

            if (!word.guessLetter(guess)) {
                player.loseLife();
                display.showLostLifeMessage();
            }

            if (word.isGuessed()) {
                display.showWinMessage(word.getWord());
            }
        }

        if (!word.isGuessed()) {
            display.showLoseMessage(word.getWord());
        }
    }

    public char getUserInput() {
        while (true) {

            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Ввод не может быть пустым. Пожалуйста, введите букву.");
            } else if (input.length() > 1) {
                System.out.println("Введите только одну букву.");
            } else if (!Character.isLetter(input.charAt(0))) {
                System.out.println("Ошибка: Ввод должен содержать только буквы.");
            } else {
                return input.toLowerCase().charAt(0);
            }
        }
    }

    public void close() {
        scanner.close();
    }

}
