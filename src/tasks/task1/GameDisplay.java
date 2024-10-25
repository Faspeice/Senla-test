package tasks.task1;

class GameDisplay {
    private final HangmanDrawer drawer;

    public GameDisplay() {
        this.drawer = new HangmanDrawer();
    }

    public void showWelcomeMessage() {
        System.out.println("Добро пожаловать в игру Виселица!");
    }

    public void showGameStatus(String guessedWord, int lives) {
        System.out.println("\nЗагаданное слово: " + guessedWord);
        drawer.draw(lives);
    }

    public void showLostLifeMessage() {
        System.out.println("Нет такой буквы. Жизнь потеряна!");
    }

    public void showWinMessage(String word) {
        System.out.println("\nПоздравляем! Вы угадали слово: " + word);
    }

    public void showLoseMessage(String word) {
        System.out.println("\nИгра окончена. Вы проиграли. Загаданное слово было: " + word);
    }

    public void showInputMessage() {
        System.out.print("Введите букву: ");
    }
}
