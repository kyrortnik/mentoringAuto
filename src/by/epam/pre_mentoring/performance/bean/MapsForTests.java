package by.epam.pre_mentoring.performance.bean;


import java.util.HashMap;
import java.util.TreeMap;

public class MapsForTests {
    Logic logic = new Logic();

    public HashMap<Integer,String> randomHashMap(){
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0;i<10000;i++){
            map.put(i,logic.randomString());

        }
        return map;
    }

    public TreeMap<Integer,String> randomTreeMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        for (int i = 0;i<10000;i++){
            map.put(i,logic.randomString());
        }
        return map;
    }
}
