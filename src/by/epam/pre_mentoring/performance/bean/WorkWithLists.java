package by.epam.pre_mentoring.performance.bean;

import by.epam.pre_mentoring.aircompany.util.exceptions.NoValueException;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkWithLists {

    public static void findString(List<String> list, String str) throws NullPointerException{
        try{
            for (String s : list){
                if (str.equals(s)){
                    System.out.println(s);
                }

            }
        }catch (NullPointerException e){
            System.out.println("nope");
        }


    }

    public static void findString(Set<String> set, String str) {
        for (String s : set){
            if (str.equals(s)){
                System.out.println(s);
            }
        }
    }
    public static void findString(Map<Integer,String> map,String str) throws NoValueException{
        for (Map.Entry<Integer,String> map1 : map.entrySet()){
            if (str.equals(map1.getValue())){
                System.out.println(map1.getValue());
            }else {
                throw new NoValueException("no string");

            }
        }

    }


}
