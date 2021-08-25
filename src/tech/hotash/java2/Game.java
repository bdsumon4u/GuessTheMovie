package tech.hotash.java2;

public class Game {
    private final String movie;
    private final char[] guess;

    Game(String movie) {
        this.movie = movie;
        this.guess = to_(movie);
    }

    public void play() {
        print_();
    }

    private char[] to_(String movie) {
        char[] guess = new char[movie.length()];
        for (int i = 0; i < this.movie.length(); i++) {
            guess[i] = this.movie.charAt(i) == ' ' ? ' ' : '_';
        }
        return guess;
    }

    private void print_() {
        System.out.println("You are guessing:" + String.valueOf(this.guess));
    }
}
