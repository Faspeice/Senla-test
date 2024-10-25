package tasks.task1;

import java.util.Arrays;

class Word {
    private final String word;
    private final char[] guessedWord;

    public Word(String word) {
        this.word = word.toLowerCase();
        this.guessedWord = new char[word.length()];
        Arrays.fill(guessedWord, '_');
    }

    public boolean guessLetter(char letter) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter && guessedWord[i] != letter) {
                guessedWord[i] = letter;
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    public boolean isGuessed() {
        return String.valueOf(guessedWord).equals(word);
    }

    public String getGuessedWord() {
        return String.valueOf(guessedWord);
    }

    public String getWord() {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}

