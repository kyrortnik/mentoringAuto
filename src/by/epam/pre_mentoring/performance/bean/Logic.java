package by.epam.pre_mentoring.performance.bean;

import  java.util.List;
import  java.util.Set;
import java.util.Map;
import java.util.Random;

public class Logic {

    // method for creating random String out of 4 symbols: a-d with length = 10;
    public String randomString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 100; // letter 'd'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char)randomLimitedInt);
        }
        return buffer.toString();
    }


    // method for string finding in List
    public static void findString(List<String> list, String str) {

        for (String s : list){
            if (str.equals(s)){
                System.out.println(s);
            }
        }

    }

    // method for string finding in Set
    public static void findString(Set<String> set, String str) {

        for (String s : set){
            if (str.equals(s)){
                System.out.println(s);
            }
        }
    }
    // method for string finding in Map
    public static void findString(Map<Integer,String> map,String str) {

        for (Map.Entry<Integer,String> map1 : map.entrySet()){
            if (str.equals(map1.getValue())){
                System.out.println(map1.getValue());
            }
        }

    }

    // method for finding key for value in map
    public static Integer findValue(Map<Integer,String> map, String str){
        Integer num = 0;
        for (int i=0;i<map.size();i++){
            if (map.get(i).equals(str)){
                num = i;
            }
        }
        return num;
    }
}
