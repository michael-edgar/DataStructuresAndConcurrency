package spelling;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void doSpellCheck() {
        Dictionary dictionary = new DictionaryArrayList("data/words_alpha.txt");
        String text = "";

        try {
            File inputFile = new File("data/hamlet.txt");
            Scanner in = new Scanner(inputFile);
            String line;
            while (in.hasNextLine()) {
                line = in.nextLine();
                text += line;
                text += "\n";
            }
        }
        catch(FileNotFoundException exc)
        {
            System.out.println("File not found");
            exc.printStackTrace();
        }

        SpellChecker spellChecker = new SpellChecker(dictionary);
        List<String> list = spellChecker.doSpellCheck(text);
        assertEquals(0,list.size());
    }

    @Test
    void doSpellCheckCustomDictionary() {
        Dictionary dictionary = new DictionaryArrayList("data/dictionary.txt");
        String text = "";

        try {
            File inputFile = new File("data/hamlet.txt");
            Scanner in = new Scanner(inputFile);
            String line;
            while (in.hasNextLine()) {
                line = in.nextLine();
                text += line;
                text += "\n";
            }
        }
        catch(FileNotFoundException exc)
        {
            System.out.println("File not found re-enter file");
            exc.printStackTrace();
        }

        SpellChecker spellChecker = new SpellChecker(dictionary);
        List<String> list = spellChecker.doSpellCheck(text);
        assertNotEquals(0,list.size());
    }
}