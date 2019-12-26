package by.epam.pre_mentoring.performance.bean;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListsForTests {

    Logic logic = new Logic();

    public ArrayList<String> randomArrayList(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0;i<10000;i++){
            list.add(logic.randomString()+ "\n");
        }
        return list;
    }

    public LinkedList<String> randomLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0;i<10000;i++){
            list.add(logic.randomString()+ "\n");
        }
        return list;
    }






}
