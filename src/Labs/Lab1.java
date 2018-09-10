package Labs;

import java.io.*;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();
        LinkedList<String> linkedList = new LinkedList();

        try
        {   // The name of the file which we will read from
            String filename = "words_alpha.txt";

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine())
            {
                // Read one string from the file
                String str = in.nextLine();
                //add str to ArrayList and LinkedList
                arrayList.add(str);
                linkedList.add(str);
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found");

        }

        testGetForArrayList(arrayList);
        testGetForLinkedList(linkedList);
        testIterateForArrayList(arrayList);
        testIterateForLinkedList(linkedList);
        testInsertForArrayList(arrayList);
        testInsertForLinkedList(linkedList);
        testRemoveForArrayList(arrayList);
        testRemoveForLinkedList(linkedList);
    }

    public static void testGetForArrayList(ArrayList list)
    {
        long getArrayTime;
        long startTime = System.currentTimeMillis();
        int reps = 10000;

        for(int i = 0; i < reps; i++)
        {
            int quantity = reps/10;
            for(int j = 0; j < quantity; j++)
            {
                list.get(j);
            }
        }

        getArrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Get Array =" +getArrayTime);
    }

    public static void testGetForLinkedList(LinkedList list)
    {
        long getLinkedTime;
        long startTime = System.currentTimeMillis();
        int reps = 10000;

        for(int i = 0; i < reps; i++)
        {
            int quantity = reps/10;
            for(int j = 0; j < quantity; j++)
            {
                list.get(j);
            }
        }

        getLinkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Get Linked =" +getLinkedTime);
    }

    public static void testIterateForArrayList (ArrayList list)
    {
        long iterateArrayTime;
        long startTime = System.currentTimeMillis();
        int reps = 10000;

        for(int i = 0; i < reps; i++)
        {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }

        iterateArrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterate Array = " +iterateArrayTime);
    }

    public static void testIterateForLinkedList(LinkedList list)
    {
        long iterateLinkedTime;
        long startTime = System.currentTimeMillis();
        int reps = 10000;

        for(int i = 0; i < reps; i++)
        {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }

        iterateLinkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterate Linked = " +iterateLinkedTime);
    }

    public static void testInsertForArrayList(ArrayList list)
    {
        long insertArrayTime;
        long startTime = System.currentTimeMillis();
        int half = list.size()/2;
        int reps = 10000;
        String s = "test";
        ListIterator it = list.listIterator(half);

        for(int i = 0; i < reps * 10; i++)
        {
            it.add(s);
        }

        insertArrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Insert Array = " +insertArrayTime);
    }

    public static void testInsertForLinkedList(LinkedList list)
    {
        long insertLinkedTime;
        long startTime = System.currentTimeMillis();
        int half = list.size()/2;
        int reps = 10000;
        String s = "test";
        ListIterator it = list.listIterator(half);

        for(int i = 0; i < reps * 10; i++)
        {
            it.add(s);
        }

        insertLinkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Insert Linked = " +insertLinkedTime);
    }

    public static void testRemoveForArrayList(ArrayList list)
    {
        long removeArrayTime;
        long startTime = System.currentTimeMillis();
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }

        removeArrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Remove Array = " +removeArrayTime);
    }

    public static void testRemoveForLinkedList(LinkedList list)
    {
        long removeLinkedTime;
        long startTime = System.currentTimeMillis();
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }

        removeLinkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Remove Linked = " +removeLinkedTime);
    }
}
