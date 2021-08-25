package tech.hotash.java2;

public class Main {

    public static void main(String[] args) {
        String random = MovieBox.random();
        Game game = new Game(random);
        game.play();
    }
}
