package by.epam.pre_mentoring.performance.main;

import by.epam.pre_mentoring.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring.performance.bean.ListsForTests;
import by.epam.pre_mentoring.performance.bean.MapsForTests;
import by.epam.pre_mentoring.performance.bean.SetsForTests;
import by.epam.pre_mentoring.performance.bean.WorkWithLists;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ReadConsole console = new ReadConsole();
        boolean check;
        long start1;
        long start2;
        float timeArrayList;
        float timeLinkedList;


        ListsForTests lists = new ListsForTests();
        ArrayList<String> arrayList = lists.randomArrayList();
        LinkedList<String> linkedList = lists.randomLinkedList();

        SetsForTests sets = new SetsForTests();
        HashSet<String> hashSet = sets.randomHashSet();
        TreeSet<String> treeSet = sets.randomTreeSet();

        MapsForTests maps = new MapsForTests();
        HashMap<Integer, String> hashMap = maps.randomHashMap();
        TreeMap<Integer, String> treeMap = maps.randomTreeMap();




        do {
            System.out.println("Which collections to compare:");
            System.out.println("1. Lists (ArrayList vs. LinkedList)");
            System.out.println("2. Sets (HashSet vs. TreeMap)");
            System.out.println("3. Maps (HashMap vs. TreeMap)");
            System.out.println("Type number of collection:");
            switch (console.readInt()) {
                case 1:

                    System.out.println("What actions?");
                    System.out.println(" 1.Show values");
                    System.out.println(" 2.Search for string");
                    System.out.println(" 3.Add string");
                    System.out.println(" 4.Remove string");
                    System.out.println("Type number");
                    switch (console.readInt()) {
                        case 1:


                            System.out.println("ArrayList values:");
                            System.out.println(arrayList);

                            System.out.println("LinkedList values:");
                            System.out.println(linkedList);

                            break;
                        case 2:

                            System.out.println("Enter string:");
                            String str = console.readString();

                            start1 = System.currentTimeMillis();
                            WorkWithLists.findString(arrayList, str);
                            timeArrayList = (System.currentTimeMillis() - start1);

                            start2 = System.currentTimeMillis();
                            WorkWithLists.findString(linkedList, str);
                            timeLinkedList = (System.currentTimeMillis() - start2);

                            System.out.println("Time for ArrayList to search: "+ timeArrayList + " ms.");
                            System.out.println("Time for LinkedList to search: "+ timeLinkedList+ " ms.");
                            break;
                        case 3:
                            System.out.println("Enter string:");
                            String str1 = console.readString();

                            start1 = System.currentTimeMillis();
                            arrayList.add(str1);
                            System.out.println("String is added to arrayList");
                            timeArrayList = (System.currentTimeMillis() - start1);

                            start2 = System.currentTimeMillis();
                            linkedList.add(str1);
                            System.out.println("String is added to linkedList");
                            timeLinkedList = (System.currentTimeMillis() - start2);

                            System.out.println("Time for ArrayList to add an item: "+ timeArrayList +" ms.");
                            System.out.println("Time for LinkedList to add an item: "+ timeLinkedList+ " ms.");
                            break;
                        case 4:
                            System.out.println("Enter string:");
                            String str2 = console.readString();

                            start1 = System.currentTimeMillis();
                            arrayList.remove(str2);
                            timeArrayList = (System.currentTimeMillis() - start1);

                            start2 = System.currentTimeMillis();
                            linkedList.remove(str2);
                            timeLinkedList = (System.currentTimeMillis() - start2);

                            System.out.println("Time for ArrayList to remove an item: "+ timeArrayList +" ms.");
                            System.out.println("Time for LinkedList to remove an item: "+ timeLinkedList+ " ms.");
                            break;
                    }
                    break;
                case 2:

                    System.out.println("What actions?");
                    System.out.println(" 1.Show values");
                    System.out.println(" 1.Search for string");
                    System.out.println(" 2.Add string");
                    System.out.println(" 3.Remove string");
                    System.out.println("Type number");
                    switch (console.readInt()) {
                        case 1:
                            System.out.println(hashSet);
                            break;
                        case 2:
                            System.out.println("Enter string");
                            String str = console.readString();
                            WorkWithLists.findString(hashSet, str);
                            WorkWithLists.findString(treeSet, str);
                            break;
                        case 3:
                            System.out.println("Enter string");
                            String str1 = console.readString();
                            hashSet.add(str1);
                            treeSet.add(str1);
                            break;
                        case 4:
                            System.out.println("Enter string");
                            String str2 = console.readString();
                            hashSet.remove(str2);
                            treeSet.remove(str2);
                            break;
                    }
                    break;
                case 3:

                    System.out.println("What actions?");
                    System.out.println(" 1.Show values");
                    System.out.println(" 2.Search for string");
                    System.out.println(" 3.Add string");
                    System.out.println(" 4.Remove string");
                    System.out.println("Type number");
                    switch (console.readInt()) {
                        case 1:
                            System.out.println(hashMap);
                            break;
                        case 2:
                            System.out.println("Enter string");
                            String str = console.readString();
                            WorkWithLists.findString(hashMap, str);
                            WorkWithLists.findString(treeMap, str);
                            break;
                        case 3:
                            System.out.println("Enter string");
                            String str1 = console.readString();
                            hashMap.put(hashMap.size(), str1);
                            treeMap.put(treeMap.size(), str1);
                            break;
                        case 4:
                            System.out.println("Enter string");
                            String str2 = console.readString();
                            hashMap.remove(str2);
                            treeMap.remove(str2);
                            break;
                    }
                    break;
                default:
                    System.out.println("Incorrect.Please re-enter.");

            }
            System.out.println("would you like to perform another action? Type Yes to do so:");
            String s = console.readString();

            check = s.equalsIgnoreCase("yes");

        } while (check) ;
    }
}
