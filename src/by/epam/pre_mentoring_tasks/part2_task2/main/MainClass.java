package by.epam.pre_mentoring_tasks.part2_task2.main;

import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring_tasks.part2_task2.bean.*;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions.NotValidDataTypeException;

import java.util.*;

/**
 * Task 2
 * Проверить скорость работы (добавление, поиск элемента, удаление) следующих коллекций:
 * NOTE: Для наглядности рекомендуется использовать от 10000+ элементов в коллекции
 * 1.	Lists (ArrayList vs LinkedList);
 * 2.	Sets (HashSet vs TreeSet);
 * 3.	Maps (HashMap vs TreeMap).
 *
 */

public class MainClass {
    public static void main(String[] args) throws NotValidDataTypeException {

        ReadConsole console = new ReadConsole();
        boolean check;
        long start1;
        long start2;
        float timeArrayList;
        float timeLinkedList;
        float timeHashSet;
        float timeTreeSet;
        float timeHashMap;
        float timeTreeMap;


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
                            Logic.findString(arrayList, str);
                            timeArrayList = (System.currentTimeMillis() - start1);

                            start2 = System.currentTimeMillis();
                            Logic.findString(linkedList, str);
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
                    System.out.println(" 2.Search for string");
                    System.out.println(" 3.Add string");
                    System.out.println(" 4.Remove string");
                    System.out.println("Type number");
                    switch (console.readInt()) {
                        case 1:

                            System.out.println("hashSet values:");
                            System.out.println(hashSet);

                            System.out.println("treeSet values:");
                            System.out.println(treeSet);
                            break;
                        case 2:
                            System.out.println("Enter string");
                            String str = console.readString();

                            start1 = System.currentTimeMillis();
                            Logic.findString(hashSet, str);
                            timeHashSet = System.currentTimeMillis() - start1;

                            start2 = System.currentTimeMillis();
                            Logic.findString(treeSet, str);
                            timeTreeSet = System.currentTimeMillis() - start2;

                            System.out.println("Time for hashSet to find an item: "+ timeHashSet +" ms.");
                            System.out.println("Time for TreeSet to find an item: "+ timeTreeSet+ " ms.");
                            break;
                        case 3:
                            System.out.println("Enter string");
                            String str1 = console.readString();

                            start1 = System.currentTimeMillis();
                            hashSet.add(str1);
                            timeHashSet = System.currentTimeMillis() - start1;

                            start2 = System.currentTimeMillis();
                            treeSet.add(str1);
                            timeTreeSet = System.currentTimeMillis() - start2;

                            System.out.println("Time for hashSet to add an item: "+ timeHashSet +" ms.");
                            System.out.println("Time for TreeSet to add an item: "+ timeTreeSet+ " ms.");
                            break;
                        case 4:
                            System.out.println("Enter string");
                            String str2 = console.readString();

                            start1 = System.currentTimeMillis();
                            hashSet.remove(str2);
                            timeHashSet = System.currentTimeMillis() - start1;

                            start2 = System.currentTimeMillis();
                            treeSet.remove(str2);
                            timeTreeSet = System.currentTimeMillis() - start2;

                            System.out.println("Time for hashSet to remove an item: "+ timeHashSet +" ms.");
                            System.out.println("Time for TreeSet to remove an item: "+ timeTreeSet+ " ms.");

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

                            System.out.println("hasMap values:");
                            System.out.println(hashMap);

                            System.out.println("treeMap values:");
                            System.out.println(treeMap);
                            break;
                        case 2:
                            System.out.println("Enter string");
                            String str = console.readString();

                            start1 = System.currentTimeMillis();
                            Logic.findString(hashMap, str);
                            timeHashMap = System.currentTimeMillis() - start1;

                            start2 = System.currentTimeMillis();
                            Logic.findString(treeMap, str);
                            timeTreeMap = System.currentTimeMillis() - start2;

                            System.out.println("Time for hashMap to find an item: "+ timeHashMap +" ms.");
                            System.out.println("Time for treeMap to find an item: "+ timeTreeMap+ " ms.");

                            break;
                        case 3:
                            System.out.println("Enter string");
                            String str1 = console.readString();

                            start1 = System.currentTimeMillis();
                            hashMap.put(hashMap.size(), str1);
                            timeHashMap = System.currentTimeMillis() - start1;

                            start2 = System.currentTimeMillis();
                            treeMap.put(treeMap.size(), str1);
                            timeTreeMap = System.currentTimeMillis() - start2;

                            System.out.println("Time for hashMap to add an item: "+ timeHashMap +" ms.");
                            System.out.println("Time for treeMap to add an item: "+ timeTreeMap+ " ms.");
                            break;
                        case 4:
                            System.out.println("Enter string");
                            String str2 = console.readString();



                            start1 = System.currentTimeMillis();
                            hashMap.remove(Logic.findValue(hashMap,str2));
                            timeHashMap = System.currentTimeMillis() - start1;

                            start2 = System.currentTimeMillis();
                            treeMap.remove(Logic.findValue(treeMap,str2));
                            timeTreeMap = System.currentTimeMillis() - start2;

                            System.out.println("Time for hashMap to remove an item: "+ timeHashMap +" ms.");
                            System.out.println("Time for treeMap to remove an item: "+ timeTreeMap+ " ms.");

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
