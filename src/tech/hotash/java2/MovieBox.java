package tech.hotash.java2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieBox {
    private static final File movies = new File("src/movies.txt");

    public static void list() {
        try {
            Scanner sc = new Scanner(movies);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

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
}
