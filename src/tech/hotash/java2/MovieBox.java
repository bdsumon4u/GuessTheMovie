package tech.hotash.java2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MovieBox {
    private static final File movies = new File("src/movies.txt");

    public static int length() {
        int length = 0;
        try {
            Scanner sc = new Scanner(movies);
            while (sc.hasNextLine()) {
                sc.nextLine();
                length++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return length;
    }

    public static String random() {
        String line = null;
        Random rand = new Random();

        try {
            Scanner sc = new Scanner(movies);
            for (int i = rand.nextInt(length()) + 1; i != 0; i--) {
                line = sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return line;
    }
}
