package Lab9.FilesExample;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Finds a target string from a file. The program will print out the number of
 * lines containing the target string.
 */
public class MyRunnable implements Runnable {

    private String searchString;
    private String filename;

    public MyRunnable(String s, String aFilename) {
        searchString = s;
        filename = aFilename;
    }

    public void run() {
        int count = 0;
        try {
            Scanner in = new Scanner(new FileInputStream(filename));

            while (in.hasNextLine()) {
                String line = in.nextLine();
                if ((line.indexOf(searchString)) != -1) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename + " not found!");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Number of lines containing "+ searchString + " in "
                + filename + ": " + count);
    }
}