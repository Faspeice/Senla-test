package tasks.task1;

public class Main {
    private static final String[] WORDS = {
            "Программированике",
            "Виселица",
            "Кот",
            "Гидразинокарбонилметилбромфенилдигидробенздиазепин",
            "Сенла"
    };
    private static final int MAX_LIVES = 6;

    public static void main(String[] args) {
        Game game = new Game(WORDS, MAX_LIVES);
        game.play();
        game.close();
    }
}