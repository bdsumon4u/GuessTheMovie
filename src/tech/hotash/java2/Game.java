package tech.hotash.java2;

import java.util.Scanner;

public class Game {
    private final String movie;
    private final char[] guess;
    private final char[] wrong;
    private int wrong_count = 0;
    private int score = 0;

    Game(String movie) {
        this.movie = movie;
        this.guess = to_(movie);
        this.wrong = new char[10];
    }

    public void play() {
        char charNow;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < movie.length(); i++) {
            print_();
            wrongs();
            System.out.print("Guess a letter: ");
            charNow = sc.next().charAt(0);
            this.search_char(charNow);
        }
    }

    private char[] to_(String movie) {
        char[] guess = new char[movie.length()];
        for (int i = 0; i < this.movie.length(); i++) {
            if (this.movie.charAt(i) == ' ') {
                guess[i] = ' ';
                this.score++;
            } else {
                guess[i] = '_';
            }
        }
        return guess;
    }

    private void print_() {
        System.out.println("You are guessing: " + String.valueOf(this.guess));
    }

    private void wrongs() {
        System.out.print("You have guessed (" + this.wrong_count + ") wrong letters:");
        for (int i = 0; i < this.wrong_count; i++) {
            System.out.print(" " + this.wrong[i]);
        }
        System.out.println();
    }

    private void search_char(char ch) {
        boolean found = false;
        for (int i = 0; i < this.movie.length(); i++) {
            if (this.movie.charAt(i) == ch) {
                System.out.print(ch);
                found = true;
            }
        }
        System.out.println();

        if (!found) {
            this.wrong[this.wrong_count++] = ch;
        }
    }
}
