package by.epam.pre_mentoring_tasks.part2_task2.bean;


import java.util.HashSet;
import java.util.TreeSet;

public class SetsForTests {
    Logic logic = new Logic();

    public HashSet<String> randomHashSet(){
        HashSet<String> set = new HashSet<>();
        for (int i = 0;i<20000;i++){
            set.add(logic.randomString());
        }
        return set;
    }

    public TreeSet<String> randomTreeSet(){
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0;i<20000;i++){
            set.add(logic.randomString());
        }
        return set;
    }
}
