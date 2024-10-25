package tasks.task1;

class Player {
    private int lives;

    public Player(int lives) {
        this.lives = lives;
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
        }
    }

    public int getLives() {
        return lives;
    }

    public boolean isAlive() {
        return lives > 0;
    }
}
