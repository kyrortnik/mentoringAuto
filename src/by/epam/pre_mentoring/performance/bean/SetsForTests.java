package by.epam.pre_mentoring.performance.bean;


import java.util.HashSet;
import java.util.TreeSet;

public class SetsForTests {
    Logic logic = new Logic();

    public HashSet<String> randomHashSet(){
        HashSet<String> set = new HashSet<>();
        for (int i = 0;i<10000;i++){
            set.add(logic.randomString()+ "\n");
        }
        return set;
    }

    public TreeSet<String> randomTreeSet(){
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0;i<10000;i++){
            set.add(logic.randomString()+ "\n");
        }
        return set;
    }
}
