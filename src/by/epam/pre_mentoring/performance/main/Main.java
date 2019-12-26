package by.epam.pre_mentoring.performance.main;
import by.epam.pre_mentoring.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring.aircompany.util.exceptions.NoValueException;
import by.epam.pre_mentoring.performance.bean.ListsForTests;
import by.epam.pre_mentoring.performance.bean.MapsForTests;
import by.epam.pre_mentoring.performance.bean.SetsForTests;
import by.epam.pre_mentoring.performance.bean.WorkWithLists;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NoValueException {
        ReadConsole console = new ReadConsole();
        boolean check;


        do {
            System.out.println("Which collections to compare:");
            System.out.println("1. Lists (ArrayList vs. LinkedList)");
            System.out.println("2. Sets (HashSet vs. TreeMap)");
            System.out.println("3. Maps (HashMap vs. TreeMap)");
            System.out.println("Type number of collection:");
            switch (console.readInt()) {
                case 1:
                    //1. method on assigning random 10000 values to Array/Linked list
                    ListsForTests lists = new ListsForTests();
                    ArrayList<String> arrayList = lists.randomArrayList();
                    LinkedList<String> linkedList = lists.randomLinkedList();
                    System.out.println("Random values have been assigned for both ArrayList and LinkedList.");
                    System.out.println("What actions?");
                    System.out.println(" 1.Search for string");
                    System.out.println(" 2.Add string");
                    System.out.println(" 3.Remove string");
                    System.out.println("Type number");
                    switch (console.readInt()) {
                        case 1:
                            System.out.println("Enter string");
                            String str = console.readString();
                            WorkWithLists.findString(arrayList, str);
                            WorkWithLists.findString(linkedList, str);
                            break;
                        case 2:
                            System.out.println("Enter string");
                            String str1 = console.readString();
                            arrayList.add(str1);
                            linkedList.add(str1);
                            break;
                        case 3:
                            System.out.println("Enter string");
                            String str2 = console.readString();
                            arrayList.remove(str2);
                            linkedList.remove(str2);
                            break;
                    }
                    break;
                case 2:
                    SetsForTests sets = new SetsForTests();
                    HashSet<String> hashSet = sets.randomHashSet();
                    TreeSet<String> treeSet = sets.randomTreeSet();
                    System.out.println("Random values have been assigned for both HashSet and TreeSet.");
                    System.out.println("What actions?");
                    System.out.println(" 1.Search for string");
                    System.out.println(" 2.Add string");
                    System.out.println(" 3.Remove string");
                    System.out.println("Type number");
                    switch (console.readInt()) {
                        case 1:
                            System.out.println("Enter string");
                            String str = console.readString();
                            WorkWithLists.findString(hashSet, str);
                            WorkWithLists.findString(treeSet, str);
                        case 2:
                            System.out.println("Enter string");
                            String str1 = console.readString();
                            hashSet.add(str1);
                            treeSet.add(str1);
                        case 3:
                            System.out.println("Enter string");
                            String str2 = console.readString();
                            hashSet.remove(str2);
                            treeSet.remove(str2);
                    }
                    break;
                case 3:
                    MapsForTests maps = new MapsForTests();
                    HashMap<Integer, String> hashMap = maps.randomHashMap();
                    TreeMap<Integer, String> treeMap = maps.randomTreeMap();
                    System.out.println("Random values have been assigned for both HashMap and TreeMap.");
                    System.out.println("What actions?");
                    System.out.println(" 1.Search for string");
                    System.out.println(" 2.Add string");
                    System.out.println(" 3.Remove string");
                    System.out.println("Type number");
                    switch (console.readInt()) {
                        case 1:
                            System.out.println("Enter string");
                            String str = console.readString();
                            WorkWithLists.findString(hashMap, str);
                            WorkWithLists.findString(treeMap, str);
                        case 2:
                            System.out.println("Enter string");
                            String str1 = console.readString();
                            hashMap.put(hashMap.size(), str1);
                            treeMap.put(treeMap.size(), str1);
                        case 3:
                            System.out.println("Enter string");
                            String str2 = console.readString();
                            hashMap.remove(str2);
                            treeMap.remove(str2);
                    }
                    break;
                default:
                    System.out.println("Incorerct.Plese reenter.");

            }
            System.out.println("would you like to perform another action? Type Yes to do so:");
            String s = console.readString();

            check = s.equalsIgnoreCase("yes");

        } while (check) ;
    }
}
