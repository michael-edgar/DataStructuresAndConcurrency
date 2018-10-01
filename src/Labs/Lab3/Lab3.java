package Lab3;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler

        List<String> arrayList = new ArrayList();
        List<String> linkedList = new LinkedList();


        try {
            //same code as Lab 1
            //Name the file
            String fileName = "words_alpha.txt"; //file in project folder
            //String fileName = "C:\\Users\\t00194492\Documents\Github\DataStructuresAndConcurrency\src\Labs\Lab3\words.txt"; //can have file in any folder

            // Using a Scanner object, prepare to read the file
            File file = new File(fileName);
            Scanner input = new Scanner(file);

            // Read each line until end of file is reached
            while (input.hasNextLine()) {
                // Read one string from the file
                String str = input.nextLine();

                // add str to ArrayList and LinkedList
                arrayList.add(str);
                linkedList.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // call testGetForArrayList, testGetForLinkedList,  testInsertForArrayList etc to test get, insert and remove for ArrayList and LinkedList.
        long startTime = System.currentTimeMillis();
        testGetForArrayList(arrayList);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime-startTime;
        System.out.println("time for ArrayList get "+ timeTaken);

        startTime = System.currentTimeMillis();
        testGetForLinkedList(linkedList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList get "+ timeTaken);

        string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler

        startTime = System.currentTimeMillis();
        testIterateForArrayList(arrayList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("time for ArrayList iterate "+ timeTaken);

        startTime = System.currentTimeMillis();
        testIterateForLinkedList(linkedList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("time for LinkedList iterate "+ timeTaken);

        string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler

        startTime = System.currentTimeMillis();
        testInsertForArrayList(arrayList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("time for ArrayList insert "+ timeTaken);

        startTime = System.currentTimeMillis();
        testInsertForLinkedList(linkedList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("time for LinkedList insert "+ timeTaken);

        string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler

        startTime = System.currentTimeMillis();
        testRemoveForArrayList(arrayList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("time for ArrayList remove "+ timeTaken);

        startTime = System.currentTimeMillis();
        testRemoveForLinkedList(linkedList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("time for LinkedList remove "+ timeTaken);

        string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler
    }

    public static void testGetForArrayList(List list) {
        testGetForList(list);
    }

    public static void testGetForLinkedList(List list) {
        testGetForList(list);
    }

    public static void testIterateForArrayList(List list) {testIterateForList(list);}

    public static void testIterateForLinkedList(List list) {testIterateForList(list);}

    public static void testInsertForArrayList(List list) {testInsertForList(list);}

    public static void testInsertForLinkedList(List list) {testInsertForList(list);}

    public static void testRemoveForArrayList(List list) {testInsertForList(list);}

    public static void testRemoveForLinkedList(List list) {testInsertForList(list);}

    public static void testGetForList(List list) {
        int reps = 15000;
        for (int i = 0; i < reps; i++) {
            // reps is the number of repetitions
            // declare reps as something large e.g. 10000
            int quantity = reps / 10;
            for (int j = 0; j < quantity; j++) // declare quantity reps/10
            // depends on your list size
            {
                list.get(j); // list is your list
            }			        // (ArrayList or LinkedList)

        }
    }

    public static void testIterateForList (List list)
    {
        int reps = 10000;

        for(int i = 0; i < reps; i++)
        {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }
    }

    public static void testInsertForList(List list)
    {
        int half = list.size()/2;
        int reps = 10000;
        String s = "test";
        ListIterator it = list.listIterator(half);

        for(int i = 0; i < reps * 10; i++)
        {
            it.add(s);
        }
    }

    public static void testRemoveForList(List list)
    {
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
