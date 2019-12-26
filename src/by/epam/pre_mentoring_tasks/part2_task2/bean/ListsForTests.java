package by.epam.pre_mentoring_tasks.part2_task2.bean;

import java.util.*;


public class ListsForTests {

    Logic logic = new Logic();

    public ArrayList<String> randomArrayList(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0;i<20000;i++){
            list.add(logic.randomString());
        }
        return list;
    }

    public LinkedList<String> randomLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0;i<20000;i++){
            list.add(logic.randomString());
        }
        return list;
    }








}
